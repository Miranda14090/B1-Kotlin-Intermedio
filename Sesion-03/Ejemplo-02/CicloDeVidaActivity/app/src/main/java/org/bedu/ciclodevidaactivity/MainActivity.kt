package org.bedu.ciclodevidaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext,"onCreate Ejecutado", Toast.LENGTH_SHORT).show()
    }

    override fun onStart(){
        super.onStart()

        Toast.makeText(applicationContext,"onStart ejecutado", Toast.LENGTH_SHORT).show()
    }


    override fun onResume(){
        super.onResume()

        Toast.makeText(applicationContext,"onResume ejecutado", Toast.LENGTH_SHORT).show()
    }

    override fun onPause(){
        super.onPause()

        Toast.makeText(applicationContext,"onPause ejecutado", Toast.LENGTH_SHORT).show()
    }

    override fun onStop(){
        super.onStop()

        Toast.makeText(applicationContext,"onStop ejecutado", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart(){
        super.onRestart()

        Toast.makeText(applicationContext,"onRestart ejecutado", Toast.LENGTH_SHORT).show()
    }



    override fun onDestroy(){
        super.onDestroy()

        Toast.makeText(applicationContext,"onDestroy ejecutado", Toast.LENGTH_SHORT).show()
    }
}
