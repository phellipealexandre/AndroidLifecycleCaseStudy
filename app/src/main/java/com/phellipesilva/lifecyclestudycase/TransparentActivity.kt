package com.phellipesilva.lifecyclestudycase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class TransparentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transparent)

        val bundleState = if (savedInstanceState == null) "null" else "bundle"
        Log.w("LifecycleStudyCase", "Transparent Activity onCreate($bundleState)")
    }

    override fun onStart() {
        super.onStart()
        Log.w("LifecycleStudyCase", "Transparent Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.w("LifecycleStudyCase", "Transparent Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.w("LifecycleStudyCase", "Transparent Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("LifecycleStudyCase", "Transparent Activity onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("LifecycleStudyCase", "Transparent Activity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("LifecycleStudyCase", "Transparent Activity onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)

        val bundleState = if(outState == null) "null" else "bundle"
        val persistableBundleState = if(outPersistentState == null) "null" else "persistableBundle"

        Log.w("LifecycleStudyCase", "Transparent Activity onSaveInstanceState($bundleState, $persistableBundleState)")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        val bundleState = if (savedInstanceState == null) "null" else "bundle"
        Log.w("LifecycleStudyCase", "Transparent Activity onRestoreInstanceState($bundleState)")
    }
}
