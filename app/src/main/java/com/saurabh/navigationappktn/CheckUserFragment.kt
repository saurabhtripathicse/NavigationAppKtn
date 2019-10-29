package com.saurabh.navigationappktn


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_check_user.view.*

/**
 * A simple [Fragment] subclass.
 */
class CheckUserFragment : Fragment() {

    private lateinit var viewofLayout:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        viewofLayout = inflater.inflate(R.layout.fragment_check_user, container, false)

        return viewofLayout
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewofLayout.txt_heading.text = arguments?.let { CheckUserFragmentArgs.fromBundle(it).dataSplash }

    }
}