package com.raywenderlich.android.whysoserious.ui.main

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.raywenderlich.android.whysoserious.R

class FragmentStart: AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.fragment_start)

    }
}