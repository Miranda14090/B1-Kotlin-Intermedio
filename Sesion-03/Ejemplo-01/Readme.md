## -Introducción a las Activities

### OBJETIVO

- Que el alumno comprenda el concepto de activities, que conozca la construcción básica de su clase y la relación con otros archivos del proyecto.

#### REQUISITOS

1. Haber entendido el concepto de Activity, abordado en el Prework.
2. Conocer la estructura básica de un proyecto.
3. Comprender de forma general el archivo AndroidManifest.xml

#### DESARROLLO

La idea básica de lo que es un Activity la podemos definir como una pantalla. Al crear un proyecto vacío, no tendríamos ninguna pantalla prefabricada, por lo cual tenemos qué detectar y crear los elementos faltantes para proveer a nuestra aplicación con un Activity. Lo haremos siguiendo los pasos del ejemplo:

1.- Crear un nuevo proyecto y seleccionar uno sin Activity.
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-01/Images/01.png)
2.- Escribir el nombre y el package name como aparecen en la imagen 
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-01/Images/02.png)
3.- Los incisos a) y b) son directorios que deberían tener un archivo, pero están vacíos, el inciso c) corresponde al botón "run" para correr la aplicación en nuestro simulador. Da click al inciso c).
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-01/Images/03.png)
....
....
....
¡Error! un globo en la parte inferior nos indica que nos falta una Actividad por defecto. Como elegimos un proyecto sin Activity, debemos crearlo nosotros manualmente junto a la UI (User Interface) que infla nuestro Activity. 
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-01/Images/04.png)

4.- Crear un nuevo Android Resource Directory en el nivel del directorio señalado por el inciso c). 
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-01/Images/05.png)

5.- Elegir como tipo de Recurso "layout", al igual que el nombre
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-01/Images/06.png)

6.- Crear un nuevo Layout (este tema se abordará con mayor profundidad en la Sesión 4)
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-01/Images/07.png)

7.- Nombrar el archivo como activity_example
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-01/Images/08.png)

8.- En la carpeta encerrada por el inciso a), dar click derrecho y crear una nueva clase Kotlin
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-01/Images/09.png)

11.- Nombrar a dicho archivo ExampleActivity y en tipo, seleccionar Class
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-01/Images/11.png)

Al aceptar, debe quedar un código similar a este

```
package.org.bedu.ejemploactivity

class ExampleActivity{
}
```

12.- La clase final tiene qué quedar de la siguiente forma: 

```
package org.bedu.ejemploactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ExampleActivity: AppCompatActivity(){

    override fun onCreate( savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

    }
}
```

13.- A continuación, abrir el archivo Manifest de nuestro proyecto y agregar el tag Activity con el nombre de nuestra Activity como atributo, como se muestra en la imagen, y después corremos nuestra aplicación.
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-01/Images/17.png
...
...
...
¡Error! Ahora qué sucede? Para abrir nuestra aplicación desde cero, necesitamos determinar cual es nuestro punto de entrada principal, y eso lo determinamos con la acción ACTION_MAIN, mientras que con la categoría CATEGORY_LAUNCHER indicamos que el ícono de esta actividad debe colocarse en el selector de la aplicación del sistema. 

Nuestro Manifest queda de esta forma: 
![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-01/Images/18.png)
.
..
...
¡Listo! en la pantalla de nuestro emulador podremos ver que la aplicación a iniciado con una ventana en blanco.




