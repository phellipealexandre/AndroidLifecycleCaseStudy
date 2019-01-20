package com.phellipesilva.lifecyclestudycase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val bundleState = if (savedInstanceState == null) "null" else "bundle"
        Log.i("LifecycleStudyCase", "First Activity onCreate($bundleState)")
    }

    override fun onStart() {
        super.onStart()
        Log.i("LifecycleStudyCase", "First Activity onStart")
        finish()
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifecycleStudyCase", "First Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifecycleStudyCase", "First Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("LifecycleStudyCase", "First Activity onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("LifecycleStudyCase", "First Activity onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LifecycleStudyCase", "First Activity onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)

        val bundleState = if(outState == null) "null" else "bundle"
        val persistableBundleState = if(outPersistentState == null) "null" else "persistableBundle"
        Log.i("LifecycleStudyCase", "First Activity onSaveInstanceState($bundleState, $persistableBundleState)")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        val bundleState = if(savedInstanceState == null) "null" else "bundle"
        Log.i("LifecycleStudyCase", "First Activity onRestoreInstanceState($bundleState)")
    }
}
