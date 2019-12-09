package org.bedu.fragmentlifecyle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        Log.d("MY_FRAGMENT","onAttach ejecutándose en segundo Fragment")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("MY_FRAGMENT","onCreate ejecutándose en segundo Fragment")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("MY_FRAGMENT","onCreateView ejecutándose en segundo Fragment")
        //return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment2,container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Log.d("MY_FRAGMENT","onActivityCreated ejecutándose en segundo Fragment")
    }

    override fun onStart(){
        super.onStart()

        Log.d("MY_FRAGMENT","onStart ejecutándose en segundo Fragment")
    }

    override fun onResume(){
        super.onResume()

        Log.d("MY_FRAGMENT","onResume ejecutándose en segundo Fragment")
    }

    override fun onPause(){
        super.onPause()

        Log.d("MY_FRAGMENT","onPause ejecutándose en segundo Fragment")
    }

    override fun onStop(){
        super.onStop()

        Log.d("MY_FRAGMENT","onStop ejecutándose en segundo Fragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.d("MY_FRAGMENT","onDestroyView ejecutándose en segundo Fragment")
    }
    override fun onDestroy(){
        super.onDestroy()

        Log.d("MY_FRAGMENT","onDestroy ejecutándose en segundo Fragment")
    }

    override fun onDetach() {
        super.onDetach()

        Log.d("MY_FRAGMENT","onDetach ejecutándose en segundo Fragment")
    }

}