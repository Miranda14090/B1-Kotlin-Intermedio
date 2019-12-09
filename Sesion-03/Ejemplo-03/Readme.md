## Fragments

### OBJETIVO

- Escribir el código que integra uno o varios Fragments a un Activity y analizar el flujo del ciclo de vida de los Fragments. 

#### REQUISITOS

1. Haber estudiado el ciclo de vida de los fragments.
2. Haber concluido el capítulo de Activities de esta sesiónn

#### DESARROLLO

1.- Crear un proyecto con Activity vacía.

2.- Determinar el nombre del proyecto y del paquete de la siguiente forma:
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-03/01.png)

3.- En el MainActivity, implementar el fragment manager para embeber al Fragment. El manager se encargará de crear
la Transaction, que en este caso agregará el Fragment al Activity. la funciónn commit es la que se encarga de ejecutar los cambios. la siguiente 

```
  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager //creando el Fragment Manager
        val fragmentTransaction = fragmentManager.beginTransaction() 

        val fragment = MyFragment() //Creando una instancia de mi Fragmento
        fragmentTransaction.add(android.R.id.content, fragment) //Agrego mi fragmento al Activity a través de mi Transaction
        fragmentTransaction.commit() //ejecuto los cambios
       }
```

4.- Crear una clase MyFragment con el siguiente código, que se encarga de imprimir en pantalla las llamadas a los métodos de su lifecycle:
```
package org.bedu.fragmentlifecyle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MyFragment : Fragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        Log.d("MY_FRAGMENT","onAttach ejecutándose")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("MY_FRAGMENT","onCreate ejecutándose")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("MY_FRAGMENT","onCreateView ejecutándose")
        //return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.my_fragment,container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Log.d("MY_FRAGMENT","onActivityCreated ejecutándose")
    }

    override fun onStart(){
        super.onStart()

        Log.d("MY_FRAGMENT","onStart ejecutándose")
    }

    override fun onResume(){
        super.onResume()

        Log.d("MY_FRAGMENT","onResume ejecutándose")
    }

    override fun onPause(){
        super.onPause()

        Log.d("MY_FRAGMENT","onPause ejecutándose")
    }

    override fun onStop(){
        super.onStop()

        Log.d("MY_FRAGMENT","onStop ejecutándose")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.d("MY_FRAGMENT","onDestroyView ejecutándose")
    }
    override fun onDestroy(){
        super.onDestroy()

        Log.d("MY_FRAGMENT","onDestroy ejecutándose")
    }

    override fun onDetach() {
        super.onDetach()

        Log.d("MY_FRAGMENT","onDetach ejecutándose")
    }

}
```

5.- en el directorio de layout, agregar my_fragment.xml y agregar el siguiente código (el tema de layouts será explicado a más detalle en la siguiente sesión):
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:id="@+id/fragment_container">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:text="Fragment primero" />

</LinearLayout>
```

6.- Correr la aplicación, al igual que en el [Ejemplo 02](/../../tree/master/Sesion-03/Ejemplo-02) de esta sesión, explora y comenta cómo es el fluyo de los estados dependiendo de las acciones que hagas (abrir la app, cerrarla, minimizarla).


<details>

        <summary>Solucion</summary>
        <p> Agrega aqui la solucion</p>
        <p>Recuerda! escribe cada paso para desarrollar la solución del ejemplo o reto </p>
</details>

Agrega una imagen dentro del ejemplo o reto para dar una mejor experiencia al alumno (Es forzoso que agregages al menos una) ![imagen](https://picsum.photos/200/300)


