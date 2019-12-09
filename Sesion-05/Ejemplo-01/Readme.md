## Ejemplo 01: Introduccion al diseño de interfaces - Kotlin Intermedio

### OBJETIVO

- Conocer las bases del diseño de interfaces mobiles y el proposito de tener diseños organicos.

### REQUISITOS

1. Tener conocimiento previo sobre Activities, Layouts, Fragments.
2. Haber usado las principales herramientas de Android Studio.

### DESARROLLO

#### AppDesign

Uno de los aspectos más importantes en el desarrollo de Android es el diseño de aplicaciones los aspectos socios del diseño de la aplicación son las vistas el texto y los botones, Los colores y la ubicación que ocupan en la pantalla. Las sugerencias al usuario sobre qué hacer a continuación también son un aspecto esencial del diseño. Los usuarios deben poder decirDe un vistazo lo que están viendo, lo que es importante y lo que pueden hacer.

Compraremos las siguientes dos imágenes, Para darnos una idea de lo importante que es el diseño en las aplicaciones veamos la imagen de la izquierda, cierto son muchos controles y no hay un orden, ahora si nos enfocamos en la imagen de la derecha es realmente sencillo darnos cuenta en donde están las acciones y que son tarjetas que tienen título tal vez un cuerpo y un botón de acción.

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-05/Ejemplo-01/Images/1.png)

Tomando en cuenta lo anterior, recordemos que para pantalla simples, un buen diseño a menudo significa mostrar menos y para pantallas con mucha información importante, un buen diseño hace que la información densa sea comprensible de un vistazo.

Es importante saber que tengamos o no acceso a un diseñador debemos siempre recordar los siguientes puntos:

- Define casos de uso. Es decir escribe que es lo que deben de lograr tus usuarios con tu aplicación y cómo lo van hacer.
- Implementa un diseño. No te quedes con el primer borrador que realices que sólo haga lo suficiente mente bueno, una vez que implemente tu diseño ten en mente que lo más seguro es que tenga que cambiar después de ver como los usuarios reales interactúan con él.
- Obtener feedback de tu diseño. Encuentra a cualquiera con quien puedas hablar para probar tu aplicación ya sea tu familia amigos o incluso personas que acabas de conocer en tu ámbito de trabajo, pídeles que usen la aplicación que realicen un caso de uso mientras observas y tomas notas detalladas pídeles que te digan cómo fue su experiencia al usarla y pídeles su opinión acerca de que cambiarían en tu aplicación.
- Reimplementa tu diseño. Con toda la información obtenida del feedback de tus compañeros, mejora tu diseño y luego vuelve implementarlo, es posible que tengas que hacer este ciclo varias veces de diseñar y probar hasta que encuentres un diseño que a todo tu grupo de amigos o a todo el sector con el que estás probando le sea satisfactorio.

A medida que trabajamos en la aplicación es para un público más amplio, es esencial hacer que las aplicaciones sean accesibles para tantos tipos de usuarios como sea posible. Por ejemplo:

- Muchos usuarios interactúanCon las aplicaciones de diferentes maneras. Muchos usuarios son del tónicos, y los colores que contrastan para un usuario puede no funcionar para otro. Muchos usuarios tienen problemas de visión, desde la necesidad de usar anteojos hasta la ceguera.
- Algunos usuarios no pueden usar pantallas táctiles e interactúan a través de otros dispositivos de entrada como los botones.

Ahora que ya tenemos claro que es un buen diseño es la forma más importante de hacer que los usuarios usen las aplicaciones que creamos y ahora que ya conocemos los fundamentos del diseño de aplicaciones para Android. Veamos que parte de nuestra aplicación tenemos que editar o modificar o crear que impacta directamente en el diseño de nuestra aplicación. Vayamos al [Ejemplo 02](/../../tree/master/Sesion-05/Ejemplo-01/) para empezar a configurar nuestros diseños y estilos de nuestra aplicación Android.