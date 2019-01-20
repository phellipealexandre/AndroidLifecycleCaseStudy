package com.phellipesilva.lifecyclecasestudy

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("LifecycleCaseStudy", "First Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LifecycleCaseStudy", "First Fragment onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        Log.e("LifecycleCaseStudy", "First Fragment onCreateView")
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("LifecycleCaseStudy", "First Fragment onActivityCreated")

        openSecondScreenButton.setOnClickListener {
            startActivity(Intent(context, SecondActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("LifecycleCaseStudy", "First Fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("LifecycleCaseStudy", "First Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("LifecycleCaseStudy", "First Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("LifecycleCaseStudy", "First Fragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("LifecycleCaseStudy", "First Fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LifecycleCaseStudy", "First Fragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("LifecycleCaseStudy", "First Fragment onDetach")
    }
}
