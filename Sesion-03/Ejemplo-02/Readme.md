
##Ciclo de vida de un Activity

### OBJETIVO

- Volver visible el ciclo de vida de un activity a través de indicadores visual para corroborar el orden en el flujo estudiado previamente, para su posterior uso.

#### REQUISITOS

1. Haber leído el artículo del ciclo de vida de un activity. [Leer artículo](https://medium.com/@Emmitta/ciclo-de-vida-de-una-actividad-android-f30f8f2d1256)
2.- Haber realizado el [Ejemplo 01](/../../tree/master/Sesion-03/Ejemplo-01) de esta sesión

#### DESARROLLO

Como estudiamos anteriormente, cada estado del ciclo de un Activity ejecuta ciertas tareas para correr/finalizar procesos, y se pueden sobreescribir para inicializar la lógica de negocio en la pantalla. En este ejercicio vamos a confirmar el orden en el flujo previamente estudiado. 

Nos apoyaremos de un elemento visual llamado **Toast**

###### Breve explicación de un Toast
Es un elemento visual utilizado para notificar de algún evento ocurrido sin afectar en la interacción con la UI. El tiempo de aparición varía dependiendo del parámetro que se le pase.

```
Toast.makeText(applicationContext,"Mensaje mostrado en un Toast",Toast.LENGTH_SHORT).show()  
```

Para realizar el ejemplo, seguimos los siguientes pasos:

1.- Crear un nuevo proyecto con una Activity vacía.

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-02/Imagenes/01.png)

2.- Ingresar el siguiente nombre y package name para el proyecto

![](https://github.com/beduExpert/B1-Kotlin-Intermedio/blob/master/Sesion-03/Ejemplo-02/Imagenes/02.png)

3.- Al crearse el proyeccto, abrir la ventana MainActivity, en ella encontraran esto:

```
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
```
>no hay que olvidar que la sentencia *override* es un modificador que sirve para sobreescribir un método implementado por la clase que se hereda.

bajo esta función, hacer override de los otros métodos llamados durante el ciclo de vida de un Activity, e insertar en ellas el Toast con un texto que identifique en el estado del ciclo en que unon se encuentra.

4.- Después de esto, correr la aplicación en el emulador, y comprobar el flujo. Describir qué métodos se mandan a llamar cuando la aplicación se minimiza y cuando se cierra.

<details>
        <summary>Solución</summary>
        <p>La respuesta para cada método tiene la siguiente forma: </p>
        ```
        override fun onStart(){
                super.onStart()
        Toast.makeText(applicationContext,"onStart ejecutado", Toast.LENGTH_SHORT).show()
        }
        ```
        Po ejemplo para onResume(), todo texto del método anterior que diga onStart, debe ser cambiado por onResume. 
</details>


