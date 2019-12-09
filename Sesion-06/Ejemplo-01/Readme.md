## Ejemplo 01: Material Components I - Kotlin Intermedio

### OBJETIVO

- Aplicar los principios de diseño de Material a la interfaz de usuario de la aplicación.
- Usar los componentes de material para hacer que tu aplicación luzca impresionante.

### REQUISITOS

1. Tener conocimiento previo sobre Activities, Layouts, Fragments.
2. Tener conocimiento básico sobre vistas y grupos de vistas para diseñar una interfaz de usuario, en particular RecyclerView.
3. Saber utilizar los estilos y temas para personalizar el aspecto de tu aplicación.

### DESARROLLO

En este ejemplo nos vamos a concentrar en la implementación de los principales y más utilizados componentes de material. Vamos a explicar su forma de usarlos, los principales atributos de cada uno y el propósito para el que fueron diseñados.

Recuerda que siempre es importante visitar el sitio de [material.io](https://material.io/) para que des un vistazo a toda la documentación.

#### TextView

Un **MaterialTextView** es un derivado de **AppCompatTextView** que muestra texto al usuario. Es decir, este componente es meramente informativo y sólo va mostrar contenido al usuario sin ser evitable.

Para incluir un TextView, considera que tenemos un linear layout en nuestro diseño de vista, la forma de agregar uno de estos componentes es como a continuación:

```XML
<LinearLayout
  xmlns:android="http://schemas.android.com/apk/res/android"
  android:layout_width="match_parent"
  android:layout_height="match_parent">
    <TextView
      android:id="@+id/text_view_id"
      android:layout_height="wrap_content"
      android:layout_width="wrap_content"
      android:text="@string/hello" />
</LinearLayout>
```
**MaterialTextView** admite todos los atributos estándar que se pueden cambiar para a AppCompatTextView. A diferencia de lo **AppCompatTextViewque** permite especificar la altura de la línea solo en un XML de diseño de vista, **MaterialTextView** admite la capacidad de leer la altura de la línea desde un **TextAppearance style**, que se puede aplicar al **MaterialTextView** usando el atributo **style** o el **android:textAppearance**.

#### TextField

Un TextField o TextInputEditText es un componente cuyo propósito es proporcionarle al usuario un método de entrada para nuestra aplicación, es decir el usuario puede introducir texto o cualquier tipo de caracter que nosotros indiquemos a nuestra aplicacion.

Tratándose de este componente es importante saber que tiene que ser incluido dentro de un **TextInputLayout** Para poder hacer uso de las animaciones y estilos específicos de material, el componente en expecifico a usar dentro del **TextInputLayout** se llama **TextInputEditText**.

Entonces como el párrafo anterior lo indica, para poder incluir un componente de este tipo en nuestra aplicación, lo haremos de la siguiente forma:

```XML
<com.google.android.material.textfield.TextInputLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="@string/hint_text">

  <com.google.android.material.textfield.TextInputEditText
      android:layout_width="match_parent"
      android:layout_height="wrap_content"/>

</com.google.android.material.textfield.TextInputLayout>
```

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-06/Ejemplo-01/Images/2.png)

Algunas de las variaciones de este componente se pueden configurar asignándole estilo a nuestro componente contenedor, en este caso **TextInputLayout**. A continuación veamos algunas de las variaciones de las que hablamos:

- **Filled Box (Default)**: Tienen un color de fondo sólido y llaman más la atención, especialmente en los diseños en los que el campo está rodeado de otros elementos. Para usar un campo de texto relleno, aplique el siguiente estilo a su TextInputLayout: 
```XML
style="@style/Widget.MaterialComponents.TextInputLayout.FilledBox"
```
Para cambiar el color de fondo de un campo de texto relleno, puede establecer el boxBackgroundColoratributo en su TextInputLayout.
- **Outlined Box**: Tienen un borde trazado y están menos enfatizados. Para usar un campo de texto outlined, aplique el siguiente estilo a su TextInputLayout:
```XML
style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox"
```
Para cambiar el color y el ancho del trazo de un campo de texto outlined, puede establecer los atributos boxStrokeColory boxStrokeWidthen su TextInputLayout, respectivamente.

- **Height Variations**: TextInputLayout proporciona dos variaciones de altura para campos de texto filled y oulined, standard y dense. Ambos estilos (filled y oulined) tienen por defecto la altura estándar. Para reducir la altura de un TextInputEditText, puede usar un estilo dense, que reducirá el relleno vertical dentro del TextInputEditText. Puede lograr esto aplicando los estilos apropiados a su TextInputLayouty TextInputEditText, dependiendo de si está utilizando un campo de texto filled u outlined:
```XML
 style="@style/Widget.MaterialComponents.TextInputLayout.FilledBox.Dense"

 style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox.Dense"
```

#### Button

MaterialButton es un componente personalizable con estilos visuales actualizados. Este componente tiene varios estilos incorporados para admitir diferentes niveles de énfasis, ya que normalmente cualquier interfaz de usuario contendrá algunos botones diferentes para indicar diferentes acciones. Estos niveles de énfasis incluyen:

- **raised button**: un MaterialButton rectangular que se levanta y muestra reacciones de de color al ser presionado.
- **unelevated button**: un botón coloreado que muestra reacciones de de color al ser presionado pero no se levanta.

Este componente proporciona una implementación completa de MaterialDesign, para usarlo lo vamos a incluir de la siguiente forma:

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-06/Ejemplo-01/Images/3.png)

```XML
<!-- filled & eleveted button -->
<com.google.android.material.button.MaterialButton
    android:id="@+id/material_button"
    style="@style/Widget.MaterialComponents.Button"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/button_label_enabled"/>

<!-- filled & uneleveted button -->
<com.google.android.material.button.MaterialButton
    android:id="@+id/material_unelevated_button"
    style="@style/Widget.MaterialComponents.Button.UnelevatedButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/unelevated_button_label_enabled"/>

<!-- outlined button -->
<com.google.android.material.button.MaterialButton
    android:id="@+id/material_text_button"
    style="@style/Widget.MaterialComponents.Button.OutlinedButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/outlined_button_label_enabled"/>
```

#### RadioButton

Un RadioButton representa un botón con dos estados, seleccionado y no seleccionado. A diferencia de las casillas de verificación, los cambios en los estados de un botón de radio pueden afectar a otros botones del grupo. Específicamente, al seleccionar una RadioButton en un RadioGroup se desmarcará todos los demás botones en ese grupo. Un RadioButton es un círculo que se rellena cuando se selecciona.

Para poder usar este componente es necesario incluirlo en un **RadoGroup** que es el componete que se va a encargar de gestionar los estados de todos los **RadioButtons** dentro del grupo:

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-06/Ejemplo-01/Images/4.png)

```XML
<RadioGroup
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:checkedButton="@+id/first"
    android:orientation="vertical">
  <RadioButton
      android:id="@+id/first"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:text="@string/first_label"/>
  <RadioButton
      android:id="@+id/second"
      android:layout_width="wrap_content"
      android:layout_height="wrap_content"
      android:text="@string/second_label"/>
</RadioGroup>
```

#### CheckBoxes

Un CheckBox representa un botón con dos estados, seleccionado y no seleccionado. A diferencia de los RadioButtons, los cambios en los estados de una casilla de verificación no suelen afectar a otras casillas de verificación. Una casilla de verificación es un botón cuadrado redondeado con una marca para indicar su estado actual.

Verás a continuacion que es extremadamente facil usar estos componentes:

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-06/Ejemplo-01/Images/5.png)

```XML
<CheckBox
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

Ve al [Ejemplo 02](/../../tree/master/Sesion-06/Ejemplo-02/) Para ver la segunda parte de este tema.
