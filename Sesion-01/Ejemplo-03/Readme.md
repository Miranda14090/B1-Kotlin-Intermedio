## Ejemplo 03: Cómo incluir librerías de terceros (Básico) - Kotlin Intermedio

### OBJETIVO

- Reconocer en un nivel básico la forma en la que podemos incluir a nuestros desarrollos librerias o codigo de terceros.

### REQUISITOS

1. Tener conocimiento previo sobre IDE's y entornos de desarrollo.
1. Tener Instalado Android Studio, se puede descargar desde este [link](https://developer.android.com/studio).

### DESARROLLO

Es importante saber que existe una infinidad de codigo creado por otros desarrolladores que podemos utilizar en nuestros desarrollos, librerias privadas o de código abierto, esto es muy útil ya que no permite ahorrarnos mucho código.

Por el momento, solo es necesario que sepas que para incluir codigo de terceros en nuestros desarrollos podemos agregarlos en nuestro archivo **build.gradle: (Module: app)** colocando la referencia de la libreria que queremos incluir.

En la imagen de ejemplo verás que en el objeto **dependencies** estan declaradas estas con la palabra reservada **implementation** seguido del nombre de la libreria y su versión

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-01/Ejemplo-03/Images/1.png)

Este ejemplo no tiene reto puesto que mas adelante veremos a detalle la integracion de librerias de terceros en nuestros proyectos, no obstante te recomiendo que revises la siguiente [documentacion](https://docs.gradle.org/current/userguide/userguide.html) para que te des una idea de como es que funciona gradle con Android Studio 3.+, [este](https://developer.android.com/studio/build?hl=es) articulo tambien te sera util ya que en el se explican las fases de configuracion de tu proyecto.
