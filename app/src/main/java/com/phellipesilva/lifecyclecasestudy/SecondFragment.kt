package com.phellipesilva.lifecyclecasestudy

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("LifecycleCaseStudy", "Second Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LifecycleCaseStudy", "Second Fragment onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        Log.d("LifecycleCaseStudy", "Second Fragment onCreateView")
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("LifecycleCaseStudy", "Second Fragment onActivityCreated")

        openTransparentActivityButton.setOnClickListener {
            startActivity(Intent(context, TransparentActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifecycleCaseStudy", "Second Fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifecycleCaseStudy", "Second Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifecycleCaseStudy", "Second Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifecycleCaseStudy", "Second Fragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LifecycleCaseStudy", "Second Fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifecycleCaseStudy", "Second Fragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("LifecycleCaseStudy", "Second Fragment onDetach")
    }
}
