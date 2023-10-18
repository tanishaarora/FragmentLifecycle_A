package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SecondFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment 2", "onAttach")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment 2", "onCreate")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment 2", "onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment 2", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment 2", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment 2", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment 2", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment 2", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment 2", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment 2", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment 2", "onDetach")
    }
}