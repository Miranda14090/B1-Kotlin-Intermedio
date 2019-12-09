package org.bedu.fragmentlifecyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val fragment = MyFragment()
        fragmentTransaction.add(android.R.id.content, fragment)
        fragmentTransaction.commit()

        val button = findViewById<Button>(R.id.button_fragment);

        button.setOnClickListener {
            val newFragment = Fragment2()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(android.R.id.content, newFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        }


}
