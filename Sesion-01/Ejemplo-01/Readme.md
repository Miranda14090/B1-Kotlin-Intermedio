## Ejemplo 01: Android Studio y sus principales herramientas & Estructura de un proyecto Android - Kotlin Intermedio

### OBJETIVO

- Reconocer el IDE Android Studio con el que desarrollan aplicaciones móviles. Además,  conocer la estructura de un proyecto android y todos los rachivos generados por el IDE

### REQUISITOS

1. Tener conocimiento previo sobre IDE's y entornos de desarrollo.
2. Tener Instalado Android Studio, se puede descargar desde este [link](https://developer.android.com/studio).

### DESARROLLO

En el modulo anterior usabámos IntelliJ IDEA para compilar los ejercicios de Kotlin. Ese era nuestro IDE y, aunque con IntelliJ permite crear aplicaciones Android, Google nos ofrece un IDE precisamente basado en IntelliJ llamado Android Studio. Éste, está optimizado para la creacion, análisis y distribución de apps para android y nos va a proveer potentes herremientas para diseñar, codificar, probar y generar aplicaciones android.

Android Studio es el IDE oficial de Android, que se creó con el fin de acelerar el desarrollo y ayudarte a compilar apps de la más alta calidad para todos los dispositivos Android.

A continuación, crearemos un proyecto android - kotlin desde cero con Android Studio (asegúrate de que sea Android Studio 3+):

>Abrimos Android studio y nos aparecerá la siguiente ventana, ahí seleccionamos la opción **Start a new Android Studio Project**

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-01/Ejemplo-01/Images/1.png)

>En esta ventana nuestro IDE nos suguiere templates de proyectos, en esta ocasión vamos a seleccionar **Empty Activity**

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-01/Ejemplo-01/Images/2.png)

>Configuraremos nuestro proyecto asignando un nombre y asegurándonos que en la opción **Language** este marcado **Kotlin**, hecemos click en finalizar.

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-01/Ejemplo-01/Images/3.png)

>Una vez que finalice el IDE de generar el proyecto, veremos una pantalla como esta:

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-01/Ejemplo-01/Images/4.png)

>Esta es la estructura de un proyecto de android:

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-01/Ejemplo-01/Images/5.png)

- **manifest**: Contiene el archivo AndroidManifest.xml.
- **java**: Contiene los archivos Java o en este caso Kotlin de código fuente separados por nombres de paquetes, incluido el código de prueba JUnit.
- **res**: Contiene todos los recursos sin código, como diseños XML, strings de IU y también imágenes de mapa de bits, divididos en subdirectorios pertinentes. Para obtener más información sobre todos los tipos de recursos disponibles, consulta Provisión de recursos.
	- **drawable**: Archivos de mapas de bits (.png, .9.png, .jpg y .gif) o archivos XML que se han compilado en los siguientes subtipos de recursos de elemento de diseño.
	- **layout**: Archivos XML que definen el diseño de una interfaz de usuario. Consulta la sección Recurso de diseño.
	- **mipmap**: Archivos de elementos de diseño para diferentes densidades de los íconos de selectores. Para obtener más información sobre la administración de los íconos de selectores con carpetas mipmap/, consulta la sección Información general sobre la administración de proyectos.
	- **values**: Archivos XML que contienen valores simples, como strings, valores enteros y colores.

>Una vez entendida la estructura del proyecto abrimos el archivo **MainActivity.kt**

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-01/Ejemplo-01/Images/5.1.png)

>La forma de construir vistas en android es por medio de XML en este caso abrimos el archivo **activity_main.xml**

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-01/Ejemplo-01/Images/6.png)

#### Android Extensions

Por una parte, en el archivo **MainActivity** tenemos nuestra lógica, el código fuente y por otro lado en el archivo **activity_main** tenemos la definición de la vista de nuestra aplicación, en java la forma de conectar nuestra vista con la lógica es como se muestra continuación: 

>Obteniendo la instancia de un elemento de la vista desde el código java
```kotlin
	editText = (EditText) this.findViewById(R.id.{id_elemento})
```

Con el código anterior lo que logramos extraer (desde el archivo XML que representa la vista) a nuestro archivo de código fuente una instancia del elemento al que corresponde el id seleccionado.

Como podemos ver, aunque solo es una linea de código, luego tenemos que controlar más elementos visuales se vuelve tedioso tener que instanciar cada elemento de la misma forma.

Las Android Extensions (Si usas Android Studio 3.+) ya está configurado por defecto, nos van a permitir hacer referencia a nuestros elementos visuales llamandolos por su id, es decir, recordando el ejemplo, tenemos un TextView con el id **helloText** 

Por lo cual para hacer referencia a la instancia de ese elemento dentro de nuestro MainActivity solo es necesario llamarlo por su ID:

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-01/Ejemplo-01/Images/7.png)

>Principales herramientas de Android Studio:

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-01/Ejemplo-01/Images/8.png)

1. Explorador: Aqui podemos encontrar los archivos de nuestro proyecto.
2. Consola/Terminal: En este apartado encotramos la terminal y la consola donde podremos ver los outputs de la ejecucion de nuestro codigo.
3. Configuraciones de crecion: Desde aqui podemos editar las build configurations (Mas adelante aprenderemos sobre el tema), seleccionar el dispositivo ya sea virtual o fisico en el cual ejecutaremos nuestra aplicacion.
4. Controles de ejecucion:, reinicio, debug etc...
5. Esta herramienta nos abrira una ventana en donde pordremos ver/configurar mas detalles sobre la estructura de nuestro proyecto.
6. Run Anything: Esta consola nos permitira ejecutar cualquier comando, ejemplo: abrir un nuevo proyectio o archivo.
7. Sync Project: sta herramineta sincroniza nuestro proyecto con las configuraciones de **gradle**.
8. AVD Manager: Esta es una de las herramientas mas importantes pues desde aqui podremos crear dispositivos virtuales para poder probar nuestras aplicaciones sin necesidad de tener un dispositivo real.
9. SDK Manager: Desde esta herramienta podemos gestionar todo lo relacionado con el SDK (Software Development Kit).

Ahora que hemos visto la estructura de un proyecto, la creación de uno desde cero y las principales herramientas de Android Studio, ve al [Reto 01](/../../tree/master/Sesion-01/Reto-01/) y completa los puntos que se te piden.
