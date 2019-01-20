package com.phellipesilva.lifecyclecasestudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundleState = if (savedInstanceState == null) "null" else "bundle"
        Log.v("LifecycleCaseStudy", "Second Activity onCreate($bundleState)")
    }

    override fun onStart() {
        super.onStart()
        Log.v("LifecycleCaseStudy", "Second Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("LifecycleCaseStudy", "Second Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v("LifecycleCaseStudy", "Second Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v("LifecycleCaseStudy", "Second Activity onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("LifecycleCaseStudy", "Second Activity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("LifecycleCaseStudy", "Second Activity onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)

        val bundleState = if(outState == null) "null" else "bundle"
        val persistableBundleState = if(outPersistentState == null) "null" else "persistableBundle"
        Log.v("LifecycleCaseStudy", "Second Activity onSaveInstanceState($bundleState, $persistableBundleState)")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        val bundleState = if (savedInstanceState == null) "null" else "bundle"
        Log.v("LifecycleCaseStudy", "Second Activity onRestoreInstanceState($bundleState)")
    }
}
