## Ejemplo 02: Material Components II - Kotlin Intermedio

### OBJETIVO

- Aplicar los principios de diseño de Material a la interfaz de usuario de la aplicación.
- Usar los componentes de material para hacer que tu aplicación luzca impresionante.

### REQUISITOS

1. Tener conocimiento previo sobre Activities, Layouts, Fragments.
2. Tener conocimiento básico sobre vistas y grupos de vistas para diseñar una interfaz de usuario, en particular RecyclerView.
3. Saber utilizar los estilos y temas para personalizar el aspecto de tu aplicación.

### DESARROLLO

#### RecyclerView

Una de las tareas más importantes de la interfaz de usuario en Android es mostrar elementos en una lista, las listas pueden variar de simples muy complejas, una lista de vistas de texto puede mostrar datos simples, como una lista de compras. Una lista compleja, como una lista de destinos de vacaciones puede mostrar al usuario muchos detalles dentro de una cuadrícula de desplazamiento o con encabezados, puede incluir imágenes incluso botones para acciones determinadas dentro de cada elemento de la lista.

Para admitir todos estos casos de uso Android proporciona el **RecyclerView widget**.

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-06/Ejemplo-02/Images/1.png)

Uno de los más grandes beneficios de utilizar RecyclrView es que es muy eficiente para listas realmente grandes, los siguientes puntos explican lo valioso de este beneficio:

- Éste componente sólo funciona para procesar o dibujar elementos que están actualmente visibles en la pantalla, es decir si recordamos en la lista de compras de la que mencionábamos antes, supongamos que nuestra lista de compras tiene 120 elementos pero nuestra pantalla sólo nos permite mostrar 10 elementos.
- El recicler view se va encargar de mostrar estos 10 elementos y de gestionar el reciclado de las vistas cuando el usuario se desplaza hacia arriba o hacia abajo, cuando el usuario se desplaza el recicler view recicla la vista que ya no se ve Y le asigna el valor del siguiente elemento que se va a mostrar, en la siguiente ilustración no podemos ver más claro:

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-06/Ejemplo-02/Images/2.png)

Para poder implementar un recicler view necesitamos los siguientes elementos:

- Datos que vamos a mostrar.
Una coleccion de datos u objetos que represente los elementos que se van a presentar en nuestro recycler view:

```kotlin
    class User(name: String, age: Int) {
        var name: String? = ""
        var age: Int? = 0

        init {
            this.name = name
            this.age = age
        }
    }

    var users = mutableListOf<User>()
    users.add(User("Name 1", 18))
    users.add(User("Name 2", 19))
    users.add(User("Name 3", 20))
```

- Definir una instancia de RecyclerView en nuestro archivo de diseño que va a actuar como contenedor de las vistas de cada uno de los datos que vamos a mostrar.

De esta forma se va a definir un Recycler View:

```XML
<androidx.recyclerview.widget.RecyclerView
    android:id="@+id/tasksList"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"/>
```

- Un diseño que va a representar cada uno de los datos en nuestra lista, esto es mejor conocido como el ítem que se va a reciclar en la lista.

Este diseño va a representar cada elemento de la lista graficamente:

```XML
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:paddingTop="8dp"
    android:paddingBottom="8dp">
    <TextView
        android:id="@+id/user_name"
        android:layout_width="0dp"
        android:layout_weight="1"
        android:layout_height="wrap_content"
        android:text="@string/task_item_text_placeholder"/>
</LinearLayout>
```

- Un layout manager, este se va a encargar de gestionar la organización de los componentes de la interfaz de usuario en una vista.

Notese que ya lo hemos definido desde nuestro archivo de diseño, asi que para este ejmplo no necesitamos crear otra referencia:

```XML
<androidx.recyclerview.widget.RecyclerView
    android:id="@+id/tasksList"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"/>
    <!--Esta ultima linea define la instancia de nuestro layout manager-->
```

- Un adaptador, este se va encargar de conectar los datos al RecyclerView. Adapta los datos para que pueden mostrarse en el ViewHolder y de ahí el recicler view usa el adaptador para descubrir cómo mostrar los datos en la pantalla.

```kotlin
class CustomAdapter(var context: Context, tasks: MutableList<User>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // El adaptador recibe nuestra coleccion de datos
    var items: MutableList<User>? = null

    init {
        this.items = tasks
    }

    // Se crea una instancia del ViewHolder inflando la vista del item que ya habiamos definido
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.user_item, parent, false)
        return ViewHolder(view)
    }

    // Retorna la catidad de elementos en nuestra coleccion de datos.
    override fun getItemCount(): Int {
        return this.items?.size!!
    }

    //Se obtiene una instancia de viewHolder por cada elemento de nuestra coleccion de datos y se le asigan sus correspondientes valores.
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        val item = items?.get(position)
        holder.text = item?.name
    }

    // Definicion de la clase ViewHolder
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var text: TextView? = null

        init {
            text = itemView.findViewById(R.id.user_name)
        }
    }
}
```

- Un ViewHolder, éste va a contener la información de visualización para mostrar un nuevo elemento o item en el recicler view, este elemento es indispensable para mover eficientemente las vistas en la pantalla, como pudiste observar el ViewHolder forma parte del adaptador y este lo declaramos dentro del mismo.

Lo ultimo que queda hacer es conectar todo lo anterior con nuestro recycler view, en la vista donde tenermos nuestro RV colocaremos el sigiente codigo:

```kotlin
    var users = mutableListOf<User>()
    users.add(User("Name 1", 18))
    users.add(User("Name 2", 19))
    users.add(User("Name 3", 20))

    //Obtenemos la instancia de nuestro RecyclerView
    val userList = view.findViewById<RecyclerView>(R.id.userList)
    //Indica que todas las celdas tendran exactamente las misma altura/tamaño
    userList.setHasFixedSize(true)
    //Creamos una instancia de el Adaptador pasandole como parametro el contexto de la actividad y la coleccion de datos.
    val adapter = this.context?.let { CustomAdapter(it, users) }
    //Asignamos el adaptador a la propiedad adapter de el RecyclerView.
    userList.adapter = adapter
```

Eso es todo lo que se tiene que hacer para dejar funcionando el recycler view.

#### BottomNavigation

BottomNavigationView crea barras de navegación inferiores, lo que facilita la exploración y el cambio entre vistas de contenido de nivel superior con un solo toque.

Este patrón se puede usar cuando tiene menos de 5 destinos de nivel superior para navegar.

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-06/Ejemplo-02/Images/3.png)

Es necesario crear primero un recurso de menu en el cual definiremos las opciones que va a tener nuestro BottomNavigationView, para lograrlo:
- Click derecho en la carpeta res -> New/AndroidResourceFile:
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-06/Ejemplo-02/Images/4.png)

Usualmente de define de la siguiente forma:

```XML
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/opcion_uno"
        android:title="@string/bn_pending_notes"
        android:icon="@drawable/ic_note"/>
    <item
        android:id="@+id/opcion_dos"
        android:title="@string/bn_completed_notes"
        android:icon="@drawable/ic_completed"/>
</menu>
```

Una vez habiendo definido nuestro menú como lo acabamos de hacer, a continuación veremos la forma de incluir un **BottomNavigationView** en nuestro archivo de vista, ahí mismo le asignaremos el recurso de menú que hemos creado.

```XML
<FrameLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

  <!-- Contenido principal -->

  <com.google.android.material.bottomnavigation.BottomNavigationView
      android:id="@+id/bottom_navigation"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:layout_gravity="bottom"
      android:background="@color/colorPrimary"
      app:itemIconTint="@color/white"
      app:itemTextColor="@color/white"
      app:menu="@menu/bottom_navigation_menu" />

</FrameLayout>
```

En la definición de nuestro **BottomNavigationView** vemos algunas de las configuraciones o atributos más importantes para este elemento, ahora que sabemos todo esto vayamos al [Reto 01](/../../tree/master/Sesion-06/Reto-01/) y apliquemos este conocimiento dentro de nuestro proyecto final.