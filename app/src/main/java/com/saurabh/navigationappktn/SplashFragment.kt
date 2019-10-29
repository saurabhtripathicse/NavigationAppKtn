package com.saurabh.navigationappktn

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_splash.view.*

class SplashFragment : Fragment() {


   private lateinit var viewOfLayout: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        viewOfLayout = inflater.inflate(R.layout.fragment_splash, container, false)

        return viewOfLayout
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewOfLayout.btn_lets_go.setOnClickListener {

            Log.d("APPDATA", "my Message")

            val action =
                SplashFragmentDirections.actionSplashFragmentToCheckUserFragment("CHACHA")

            findNavController().navigate(action)


        }
    }
}
