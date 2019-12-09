 ## Reto: Contador regresivo

### OBJETIVO 

- Que el alumno demuestre los conocimientos adquiridos acerca de los ciclos de vida de un Activity.

#### REQUISITOS 

1. Haber terminado el [Ejemplo 02](/../../tree/master/Sesion-03/Ejemplo-02) de esta sesión


#### DESARROLLO

Para este ejercicio se pretende iniciar un contador en una activiad con diferentes casos

a) El contador sólo se debe iniciar al abrir la aplicación y se debe finalizar cuando se cierre o se minimice.
b) El contador se debe iniciar cada vez que la aplicación sea puesta en primer plano y finalizada cuando se cierre o se minimice.
c) El contador sólo se debe iniciar al abrir la aplicación y se debe finalizar únicamente cuando la app se cierre.

Para comenzar el proyecto, estos son los pasos: 

1.- Crear un proyecto con un Empty Activity

2.- El Nombre del proyecto debe ser **RetoCounter** y el package name **org.bedu.retocounter**

3.- El código de MainActivity debe ser reemplazado por es siguiente código: 
```
package org.bedu.retocounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log



class MainActivity : AppCompatActivity() {
 private lateinit var timer: CountDownTimer
    val TAG = "TIMER";

    private fun setTimer(){

        timer = object: CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val seconds = millisUntilFinished/1000;
                Log.d(TAG,"Tiempo restante: $seconds")
            }

            override fun onFinish() {
                Log.d(TAG,"Contador finalizado")
            }
        }
        timer.start()
    }

    private fun stopTimer(){
        timer.cancel()
        Log.d(TAG,"timer cancelado")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
```

no es necesario comprender los métodos implementados, por ahora basta saber que para iniciar o parar el contador, se usan estos métodos:
```
startTimer()
stopTimer()
```

4.- La ventana de log debe estar configurada de esta manera para poder visualizarla:

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Reto-02/01.png)

5.- Avanzar a otro caso implica ya haber resuelto el anterior.


<details>
	<summary>Solucion</summary>
	<p> Caso a): </p>
	
```
override fun onCreate(savedInstanceState: Bundle?) {
   super.onCreate(savedInstanceState)
   setContentView(R.layout.activity_main)

   setTimer()
 }
 
override fun onStop(){
   super.onStop()

   stopTimer()
 }
    
 override fun onDestroy(){
   super.onStop()

   stopTimer()
    }
```

<p> Caso b): </p>
```
override fun onResume() {
   super.onResume()

   setTimer()
 }
 
override fun onStop(){
   super.onStop()

   stopTimer()
 }
```

<p> Caso c): </p>
```
override fun onCreate(savedInstanceState: Bundle?) {
   super.onCreate(savedInstanceState)
   setContentView(R.layout.activity_main)

   setTimer()
 }
    
 override fun onDestroy(){
   super.onStop()

   stopTimer()
    }
```
	
</details> 


