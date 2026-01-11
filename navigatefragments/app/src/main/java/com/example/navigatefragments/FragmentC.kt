package com.example.navigatefragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentC : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_c, container, false)
    }

    override fun onViewCreated(
        view: View,
        saveInstanceState: Bundle?
    ){
        super.onViewCreated(view, saveInstanceState);
        val btnBackA=view.findViewById<Button>(R.id.btn_go_to_A)
        btnBackA.setOnClickListener {
            findNavController().popBackStack(R.id.fragmentB,true)
        }
    }
}
