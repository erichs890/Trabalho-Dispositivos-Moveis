package com.example.trabalho32

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class Frag1 : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_frag1, container, false)

        var textview = view.findViewById<TextView>(R.id.textv)

        // Inflate the layout for this fragment
        return view
    }


}