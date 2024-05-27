package com.example.trabalho32

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class Inicio : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_inicio, container, false)

        val textView = view.findViewById<TextView>(R.id.textView)

        val text = "Exposição: Centelhas em Movimento"
        val spannableText = SpannableString(text)

        spannableText.setSpan(
            ForegroundColorSpan(Color.BLUE),
            0,
            text.length / 2,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        spannableText.setSpan(
            StyleSpan(Typeface.BOLD),
            text.length / 2,
            text.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        textView.text = spannableText

        return view
    }

    companion object {
        fun newInstance(param1: String, param2: String) =
            Inicio().apply {
                arguments = Bundle().apply {
                }
            }
    }
}