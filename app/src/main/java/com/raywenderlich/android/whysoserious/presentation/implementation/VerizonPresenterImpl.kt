package com.raywenderlich.android.whysoserious.presentation.implementation

import com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface
import com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface
import com.raywenderlich.android.whysoserious.presentation.VerizonPresenter
import com.raywenderlich.android.whysoserious.ui.verizon.VerizonView
import javax.inject.Inject

class VerizonPresenterImpl @Inject constructor(
        private val database: FirebaseDatabaseInterface,
        private val authentication: FirebaseAuthenticationInterface) :VerizonPresenter {

    private lateinit var view: VerizonView

    override fun setView(view: VerizonView) {
       this.view = view
    }


}