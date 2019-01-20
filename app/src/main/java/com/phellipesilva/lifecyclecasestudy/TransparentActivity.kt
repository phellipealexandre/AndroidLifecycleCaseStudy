package com.phellipesilva.lifecyclecasestudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class TransparentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transparent)

        val bundleState = if (savedInstanceState == null) "null" else "bundle"
        Log.w("LifecycleCaseStudy", "Transparent Activity onCreate($bundleState)")
    }

    override fun onStart() {
        super.onStart()
        Log.w("LifecycleCaseStudy", "Transparent Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.w("LifecycleCaseStudy", "Transparent Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.w("LifecycleCaseStudy", "Transparent Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("LifecycleCaseStudy", "Transparent Activity onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("LifecycleCaseStudy", "Transparent Activity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("LifecycleCaseStudy", "Transparent Activity onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)

        val bundleState = if(outState == null) "null" else "bundle"
        val persistableBundleState = if(outPersistentState == null) "null" else "persistableBundle"

        Log.w("LifecycleCaseStudy", "Transparent Activity onSaveInstanceState($bundleState, $persistableBundleState)")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        val bundleState = if (savedInstanceState == null) "null" else "bundle"
        Log.w("LifecycleCaseStudy", "Transparent Activity onRestoreInstanceState($bundleState)")
    }
}
