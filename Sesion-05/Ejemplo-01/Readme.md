## Ejemplo 01: Introduccion al diseño de interfaces - Kotlin Intermedio

### OBJETIVO

- Reconocer las bases del diseño de interfaces móviles y el propósito de tener diseños orgánicos.

### REQUISITOS

1. Tener conocimiento previo sobre Activities, Layouts, Fragments.
2. Haber usado las principales herramientas de Android Studio.

### DESARROLLO

#### AppDesign

Uno de los aspectos más importantes en el desarrollo de Android en el diseño de aplicaciones son los aspectos del diseño de la aplicación. Las vistas, el texto, los botones, los colores y la ubicación que ocupan en la pantalla. Las sugerencias al usuario sobre qué hacer a continuación también son un aspecto esencial del diseño. Los usuarios deben poder decir en un vistazo lo que están viendo, lo que es importante y lo que pueden hacer.

Comparemos las siguientes dos imágenes. Para darnos una idea de lo importante que es el diseño en las aplicaciones veamos la imagen de la izquierda. Cierto, son muchos controles y no hay un orden. Ahora si nos enfocamos en la imagen de la derecha es realmente sencillo darnos cuenta en donde están las acciones, que son tarjetas que tienen título tal vez un cuerpo y un botón de acción.

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-05/Ejemplo-01/Images/1.png)

Tomando en cuenta lo anterior, recordemos que para pantallas simples, un buen diseño a menudo significa mostrar menos, y para pantallas con mucha información importante, un buen diseño hace que la información densa sea comprensible de un vistazo.

Es importante saber que tengamos o no acceso a un diseñador debemos siempre recordar los siguientes puntos:

- **Define casos de uso**. Es decir, escribe qué es lo que deben de lograr tus usuarios con tu aplicación y cómo lo van hacer.
- **Implementa un diseño**. No te quedes con el primer borrador que realices que sólo haga lo suficientemente bueno, una vez que implementes tu diseño, ten en mente que lo más seguro es que tenga que cambiar después de ver cómo los usuarios reales interactúan con él.
, - **Obtener feedback de tu diseño**. Encuentra con quien puedas hablar para probar tu aplicación ya sea tu familia amigos o incluso personas que acabas de conocer en tu ámbito de trabajo. Pídeles que usen la aplicación, que realicen un caso de uso mientras observas y tomas notas detalladas. Pídeles que te digan cómo fue su experiencia al usarla y su opinión acerca de qué cambiarían en tu aplicación.
- **Reimplementa tu diseño**. Con toda la información obtenida del feedback de tus compañeros, mejora tu diseño y luego vuelve a implementarlo. Es posible que tengas que hacer este ciclo varias veces; de diseñar y probar hasta que encuentres un diseño que a todo tu grupo de amigos o a todo el sector con el que estás probando le sea satisfactorio.

A medida que trabajamos en la aplicación es para un público más amplio. Es esencial hacer que las aplicaciones sean accesibles para tantos tipos de usuarios como sea posible. Por ejemplo:

- Muchos usuarios interactúan  con las aplicaciones de diferentes maneras. Algunos usuarios son daltónicos, y los colores que contrastan para un usuario pued6ne no funcionar para otros. Algunos usuarios tienen problemas de visión, desde la necesidad de usar anteojos hasta la ceguera.
- Algunos usuarios no pueden usar pantallas táctiles e interactúan a través de otros dispositivos de entrada como los botones.

Ahora que ya tenemos claro que un buen diseño es la forma más importante de hacer que los usuarios usen las aplicaciones que creamos y ahora que ya conocemos los fundamentos del diseño de aplicaciones para Android. Veamos qué parte de nuestra aplicación tenemos que editar, modificar o crear que impacta directamente en el diseño de nuestra aplicación. 

Vayamos al [Reto 01](/../../tree/master/Sesion-05/Reto-01/) para empezar a configurar nuestros diseños y estilos de nuestra aplicación Android.
