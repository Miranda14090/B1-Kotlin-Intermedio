## Ejemplo 03: Configurando material Design - Kotlin Fundamentals

### OBJETIVO

- Configurar nuestra aplicación para poder utilizar los componentes de la guía de diseño de material Design propuesta por Google.

### REQUISITOS

1. Tener conocimiento previo sobre Activities, Layouts, Fragments.
2. Haber usado las principales herramientas de Android Studio.

### DESARROLLO

Material Design es un sistema de diseño multiplataforma de Google, y es el sistema de diseño para Android, este proporciona especificaciones detalladas para todo en la interfaz de usuario de una aplicación, desde como se debe mostrar el texto hasta cómo diseñar una pantalla el [sitio web](https://material.io/) de material Design tiene las especificaciones completas.

En el sitio de material Design encontraremos el catálogo de todos los elementos que componen esta especificación de diseño.

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-05/Ejemplo-03/Images/1.png)

Para empezar con la configuración de Material Design en nuestra aplicación debemos asegurarnos de que agregamos la librería en la sección de dependencies de nuestro archivo **build.gradle (Module: App)**.

>Para conocer la versión más actual de la librería visita el siguiente [repositorio](https://mvnrepository.com/artifact/com.google.android.material/material).
```gradle
dependencies {
	// ...
	implementation 'com.google.android.material:material:<version>'
	// ...
}
```
Lo siguiente que tenemos que configurar es asegurarnos de que nuestras actividades **Activity** hereden de **AppCompatActivity** de la siguiente forma:

```kotlin
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
```
Después es importante indicarle a nuestra aplicación que el tema que ahora va a utilizar es el de MaterialDesign, el que va a contener nuestros materiales componentes:
```XML
<style name="Theme.MyApp" parent="Theme.MaterialComponents.DayNight">
    <!-- ... -->
</style>
```
Ahora ya podemos agregar componentes de material de Isaac a nuestros archivos de vista XML, por ejemplo si ya revisaste el catálogo de componentes del que hablamos hace unos momentos habrás visto que existe el **TextInputLayout** Que es como un texField pero con superpoderes es decir se puede marcar una línea por debajo para definir el estado y lo más emocionante es que tiene ya definidas animaciones propuestas por el mismo sistema de diseño de material Design.

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-05/Ejemplo-03/Images/2.png)

En el mismo catálogo, por cada componente nos va a indicar la forma de utilizarlos por ejemplo hablando del **TextInputLayout** podremos utilizarlo desde nuestra librería de material componentes de la siguiente forma:

```XML
<com.google.android.material.textfield.TextInputLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="@string/textfield_label">

  <com.google.android.material.textfield.TextInputEditText
      android:layout_width="match_parent"
      android:layout_height="wrap_content"/>
</com.google.android.material.textfield.TextInputLayout>
``

Te recomiendo que cada que desees utilizar un nuevo componente de material Design vayas y visites el catálogo que está en el sitio que te acabo de compartir para que sepas de qué forma incluirlo en tus vistas, ahora que ya sabes configurar material Design en tu aplicación y que ya sabes cómo incluir todos sus componentes en tus vistas ve al [Reto 02](/../../tree/master/Sesion-05/Reto-02/) Y completan los puntos que se te piden para que veas como ya va dando forma nuestro proyecto, éxito.