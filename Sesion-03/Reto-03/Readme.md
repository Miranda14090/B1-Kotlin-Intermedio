 ## Fragments múltiples

### OBJETIVO 

- Que el alumno aprenda a reemplazar un Fragmento

#### REQUISITOS 

1. Haber terminado el [Ejemplo 03](/../../tree/master/Sesion-03/Ejemplo-03) de esta sesión

#### DESARROLLO

Crear un nuevo Fragment para reemplazar con el método replace del Transaction el actual Fragment. El método a utilizar es replace, y se emplea de la misma forma que add, pero reemplaza el segundo parámetro por **R.id.fragment2_container** . Copia el código del Fragment actual, pero cambia su nombre a Fragment2 tanto al archivo como al nombre de la clase. Como consejo, modifica un poco el texto de cada método del ciclo de vida para poder diferenciar de donde viene cada mensaje al momento de consultar el log. 

También se debe crear un nuevo layout (en el directorio homónimo) para este Fragment. Nómbralo fragment2.xml y ponle el siguiente código: 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:id="@+id/fragment2_container">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:text="Fragment segundo" />

</LinearLayout>
```

Al código del Activity en el ejemplo anterior, agregar esta dependencia

>import android.widget.Button

esta sentencia es un método que se llama cuando e botón que aparece en el Acctivity es pulsado (se abordará este tema con más detalle después).

```
val button = findViewById<Button>(R.id.button_fragment);
        button.setOnClickListener {
            //AQUÍ VA EL CÓDIGO A INTRODUCIR
        }
```

<details>

	<summary>Solucion</summary>
```
val newFragment = Fragment2() //llamando al nuevo fragmento
val transaction = supportFragmentManager.beginTransaction() //obteniendo el objeto Transaction
transaction.replace(android.R.id.content, newFragment) //reemplazando el viejo fragment con el nuevo
transaction.addToBackStack(null) //añadiendo la Transacción a un stack
transaction.commit() //ejecutando los cambios
```
</details> 


