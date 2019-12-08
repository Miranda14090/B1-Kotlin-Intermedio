## Ejemplo 02: Sistema de diseño en Android - Kotlin Fundamentals

### OBJETIVO

- Conocer el sistema de diseño de Android y los archivos que se usan para configurar los temas y estilos de nuestra aplicación.
- Configurar los principales archivos del sistema de diseño de Android y definir el tema y los estilos que usaremos en nuestro proyecto.

### REQUISITOS

1. Tener conocimiento previo sobre Activities, Layouts, Fragments.
2. Haber usado las principales herramientas de Android Studio.

### DESARROLLO

#### Sistema de diseño de Android

Android proporciona un rico sistema de diseño que nos permite controlar la apariencia de todas las vistas de nuestra aplicación. Puedes usar temas estilos y ver atributos para afectar directamente el diseño. El diagrama que veremos a continuación resume en la presidencia de cada método de estilo.

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-05/Ejemplo-02/Images/1.png)

En este diagrama podemos ver el orden en el que el sistema aplican los métodos de estilo, de abajo hacia arriba por ejemplo, si establece el tamaño del texto en el tema y luego se establece el tamaño del texto de manera diferente los atributos de la vista, los atributos de la vista anularán el estilo del tema.

En Android tal como lo habíamos visto con nuestro sistema de vistas también en los archivos que tienen que ver con el sistema de diseño van a utilizar XML Para definir nuestros estilos configurar nuestro tema y configurar los atributos de nuestras vistas.

#### Atributos

Se recomienda que se utilicen los atributos sólo para especificar estilos únicos a una vista es decir si tenemos siete botones por ejemplo en una vista en la sección de estilos podemos diseñar el correspondiente a todos los botones en general pero si queremos que un solo botón se vea diferente O tenga alguna diferencia especial a los demás ese estilo se lo vamos a dar utilizando sus atributos.

>Esta es una definición de un Tex View en una de nuestras vistas, como puedes ver los elementos dentro de la definición del Text View son los atributos, echa un vistazo y podrás encontrar que además de tener su identificador también tiene como atributo el color el texto y mas atributos que por ahora no es necesario que no enfoquemos en tales.
```XML
<TextView
	android:id="@+id/textViewIntro"
	android:layout_width="match_parent"
	android:layout_height="wrap_content"
	android:layout_marginStart="16dp"
	android:layout_marginTop="16dp"
	android:layout_marginEnd="16dp"
	android:text="@string/add_gdg"
	android:textColor="#AAAAAA"
	app:layout_constraintEnd_toEndOf="parent"
	app:layout_constraintStart_toStartOf="parent"
	app:layout_constraintTop_toTopOf="parent" />
```
Es importante que recuerdes que todos absolutamente todos los elementos definidos en nuestros archivos de vista tienen una gran cantidad de atributos para modificar su ubicación en la pantalla su distribución y su estilo.

#### Estilos

Los estilos son usados para crear una colección de definiciones de estilo reutilizable, es decir como lo mencionábamos en el tema anterior si queremos Que todos los botones de nuestra aplicación sean exactamente iguales en cuanto estilo se refiere este estilo lo vamos a definir en un archivo global por decirlo de alguna forma llamado Styles si te das cuenta al definirlo en este archivo estamos diciendo que todos los componentes de ese tipo van a compartir dicha definición de estilo.

Ahora que sabemos que los estilos son grupos reutilizables de atributos que se pueden aplicar a las vistas que queramos veamos cómo crear nuestro propio estilo.

#### Paso uno: crear un estilo.
- Abrir **res/values/styles.xml**
- Dentro de la etiqueta **<resources>** define un nuevo estilo usando la etiqueta **<style>** como se muestra continuación.

>Definimos un estilo nombrándolo con el atributo **name** y especificando de qué estilo estamos heredando con la etiqueta **parent**.
```XML
<style name="TextAppearance.Title" parent="TextAppearance.MaterialComponents.Headline6">
</style>
```
Ahora que tenemos definido nuestro estilo es decir nuestro grupo definamos las propiedades que va a afectar este grupo de estilos.

Para hacerlo tenemos que colocar los atributos que se verán afectados con este grupo de estilos que hemos definido.

```XML
<style name="TextAppearance.Title" parent="TextAppearance.MaterialComponents.Headline6">
	<item name="android:textSize">24sp</item>
 	<item name="android:textColor">#555555</item>
</style>
```

Recapitulando textualmente hemos definido al principio un estilo llamado **TextAppearance.Title** y le hemos asignado dos ítems, uno para el tamaño del texto y otro para el color del texto es decir que los componentes visuales que utilicen este estilo se veran afectado en los mismos atributos.

#### Paso dos: aplicando un estilo.

Ahora para agregar nuestro estilo a un elemento visual tomemos como base el TexView que habíamos definido antes suponiendo que este TexView ya tiene definidos los atributos TextSize y TexColor, de la siguiente forma:

```XML
<TextView
	android:id="@+id/textViewIntro"
	android:text="@string/add_gdg"
	android:textSize="2sp"
	android:textColor="#AAAAAA" />
```

Ahora signamos nuestro estilo a este TextView y veamos como queda:

```XML
<TextView
	android:id="@+id/textViewIntro"
	android:text="@string/add_gdg"
	android:textAppearance="@style/TextAppearance.Title" />
```

Como puedes observar el uso de estilos hace mucho más fácil y entendible el diseño que le vamos a dar a cada elemento visual de nuestra aplicación.

#### Temas

Los temas se usan para definir colores para toda la aplicación para establecer la fuente predeterminada para toda la aplicación, los temas por naturaleza se aplican a todas las vistas dentro de la aplicación como vistas de texto botones radio buttons etc.

Como en el caso anterior de los estilos la definición de nuestro tema está dentro del archivo Styles ubicado en la siguiente ruta **res/values/styles.xml**.

Encontraremos dentro de la etiqueta Resources las definiciones de nuestros estilos y de nuestro tema, por ahora es muy probable que encontremos algo similar a lo siguiente:

```XML
<resources>

    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
    </style>

</resources>
```

Cómo podemos observar nuestra aplicación tiene un tema definido con el nombre **AppTheme** y le estamos indicando que está heredando del tema **Theme.AppCompat.Light.DarkActionBar** el cual es el que está asignado por defecto en el sistema por Android.

También nos indica que tipo de modificaciones podemos hacerle al tema por ahora sólo vemos los siguientes:
- colorPrimary
- colorPrimaryDark
- colorAccent

Para finalizar este ejemplo te dejo una lista de todos los modificadores que podemos usar para nuestros temas:

```XML
<style name="Theme.MyApp" parent="Theme.AppCompat">

  <!-- Original AppCompat attributes. -->
  <item name="colorPrimary">@color/my_app_primary_color</item>
  <item name="colorSecondary">@color/my_app_secondary_color</item>
  <item name="android:colorBackground">@color/my_app_background_color</item>
  <item name="colorError">@color/my_app_error_color</item>

  <!-- New MaterialComponents attributes. -->
  <item name="colorPrimaryVariant">@color/my_app_primary_variant_color</item>
  <item name="colorSecondaryVariant">@color/my_app_secondary_variant_color</item>
  <item name="colorSurface">@color/my_app_surface_color</item>
  <item name="colorOnPrimary">@color/my_app_color_on_primary</item>
  <item name="colorOnSecondary">@color/my_app_color_on_secondary</item>
  <item name="colorOnBackground">@color/my_app_color_on_background</item>
  <item name="colorOnError">@color/my_app_color_on_error</item>
  <item name="colorOnSurface">@color/my_app_color_on_surface</item>
  <item name="scrimBackground">@color/mtrl_scrim_color</item>
  <item name="textAppearanceHeadline1">@style/TextAppearance.MaterialComponents.Headline1</item>
  <item name="textAppearanceHeadline2">@style/TextAppearance.MaterialComponents.Headline2</item>
  <item name="textAppearanceHeadline3">@style/TextAppearance.MaterialComponents.Headline3</item>
  <item name="textAppearanceHeadline4">@style/TextAppearance.MaterialComponents.Headline4</item>
  <item name="textAppearanceHeadline5">@style/TextAppearance.MaterialComponents.Headline5</item>
  <item name="textAppearanceHeadline6">@style/TextAppearance.MaterialComponents.Headline6</item>
  <item name="textAppearanceSubtitle1">@style/TextAppearance.MaterialComponents.Subtitle1</item>
  <item name="textAppearanceSubtitle2">@style/TextAppearance.MaterialComponents.Subtitle2</item>
  <item name="textAppearanceBody1">@style/TextAppearance.MaterialComponents.Body1</item>
  <item name="textAppearanceBody2">@style/TextAppearance.MaterialComponents.Body2</item>
  <item name="textAppearanceCaption">@style/TextAppearance.MaterialComponents.Caption</item>
  <item name="textAppearanceButton">@style/TextAppearance.MaterialComponents.Button</item>
  <item name="textAppearanceOverline">@style/TextAppearance.MaterialComponents.Overline</item>

</style>
```

Ahora dirígete al ejemplo uno y pongamos a pruéba el conocimiento que acabas de adquirir, exito.

