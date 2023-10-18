package com.example.fragmentlifecycle

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class FirstFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment 1", "onAttach")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment 1", "onCreate")

    }
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view: View = inflater.inflate(R.layout.fragment_first, container, false)
        val btnSecondFragment : Button = view.findViewById(R.id.movetonext)

        btnSecondFragment.setOnClickListener {
               requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment, SecondFragment()).addToBackStack(null).commit()
        }
         //   fragmentManager?.beginTransaction()?.replace(R.id.fragment, SecondFragment())?.commit() }
        Log.d("Fragment 1", "onCreateView")
        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fragment 1", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment 1", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment 1", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment 1", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment 1", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment 1", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment 1", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment 1", "onDetach")
    }
}