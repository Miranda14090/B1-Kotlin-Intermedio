## Ejemplo 02: Cual es el objetivo de tener un Manifiesto - Kotlin Intermedio

### OBJETIVO

- Que el alumno comprenda el porque es importante y necesario tener un manifiesto (Manifest) de nuestras aplicaciones siempre.

### REQUISITOS

1. Tener conocimiento previo sobre IDE's y entornos de desarrollo.
2. Tener Instalado Android Studio, se puede descargar desde este [link](https://developer.android.com/studio).

### DESARROLLO

Todos los proyectos de android tienen que tener un manifiesto, este siempre estara en la raiz del proyecto y es esencial ya que este **AndroidManifest** describe a tu aplicacion para las heramientas de creacion de Android Studio, el sistema operativo (Android) y la tienda de aplicaciones **GooglePlay**

Entre muchas cosas, basicamente el archivo de manifiesto tiene que declarar lo siguuiente:

- El nombre del paquete de la aplicacion.
- Los componentes de la aplicacion.
    - Actividades.
    - Servicios.
    - Receptores.
    - Proveedores de contenido.
- Los permisos que necesita la aplicacion.
- Las funciones de hardware y software que requiere la aplicacion.

#### Las sigientes secciones describen algunas de las partes mas importantes del manifiesto:

### Nombre del paquete e ID de la aplicacion

Como habras visto, el manifiesto tambien esta declarado con XML, cada elemento (etiqueta) va a permitir asignar atributos.

El elemento raiz **manifest** requiere un atributo para el nombre del paquete de tu aplicación, por ejemplo el nuestro del ejemplo es:

```XML
<manifest 
    xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.miprimeraplicacion">

</manifest>
```

Como tal, el nombre del atributo package del manifiesto siempre debe coincidir con el nombre de paquete básico de tu proyecto, en el cual conservas tus actividades y otros tipos de código de la app. Por supuesto, puedes tener otros subpaquetes en tu proyecto, pero esos archivos deben importar la clase R.java usando el espacio de nombres del atributo package.

### Componentes de la aplicacion

Por cada componente de app que crees en tu aplicación como activities, services, etc .., deberás declarar un elemento XML correspondiente en el archivo de manifiesto:

- <activity> para cada subclase de Activity.
- <service> para cada subclase de Service.
- <receiver> para cada subclase de BroadcastReceiver.
- <provider> para cada subclase de ContentProvider.

Si no las declaras en el manifiesto las actividades que hayas creado el sistema no podra iniciarlas.

>Ejemplo de la declaracion de un Activity, nota que esta dentro del elemnto <application>
```XML
<manifest package="com.example.myapp" ... >
    <application ... >
        <activity android:name=".MainActivity" ... >
            ...
        </activity>
    </application>
</manifest>
```

### Permisos 

Las aplicaciones de Android deben solicitar permiso para acceder a datos del usuario confidenciales o a determinadas funciones del sistema (como la cámara y el acceso a Internet). Cada permiso se identifica con una etiqueta única. Por ejemplo, en el manifiesto de una app que necesite enviar mensajes SMS debe incluirse esta línea:

```XML
<uses-permission android:name="android.permission.SEND_SMS"/>
```

Estos van detro del elemento raiz **manifest**

### Funciones de Hardware y Software 

El elemento <uses-feature> te permite declarar funciones de hardware y software que necesita tu app. Por ejemplo, si tu aplicación no puede funcionar un dispositivo que no tiene un sensor de brújula, puedes declarar el sensor como obligatorio con la siguiente etiqueta de manifiesto:

```XML
<manifest ... >
    <uses-feature android:name="android.hardware.sensor.compass" android:required="true" />
    ...
</manifest>
```

Teniendo en cuanta que has terminado este Ejemoplo, ve al [Reto 02](/../../tree/master/Sesion-01/Reto-02/) y completa lo que se te pide, no olvides revisar la [documentacion oficial][https://developer.android.com/guide/topics/manifest/manifest-intro].