package com.raywenderlich.android.whysoserious.presentation.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/android/whysoserious/presentation/implementation/VerizonPresenterImpl;", "Lcom/raywenderlich/android/whysoserious/presentation/VerizonPresenter;", "database", "Lcom/raywenderlich/android/whysoserious/firebase/database/FirebaseDatabaseInterface;", "authentication", "Lcom/raywenderlich/android/whysoserious/firebase/authentication/FirebaseAuthenticationInterface;", "(Lcom/raywenderlich/android/whysoserious/firebase/database/FirebaseDatabaseInterface;Lcom/raywenderlich/android/whysoserious/firebase/authentication/FirebaseAuthenticationInterface;)V", "view", "Lcom/raywenderlich/android/whysoserious/ui/verizon/VerizonView;", "setView", "", "app_debug"})
public final class VerizonPresenterImpl implements com.raywenderlich.android.whysoserious.presentation.VerizonPresenter {
    private com.raywenderlich.android.whysoserious.ui.verizon.VerizonView view;
    private final com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface database = null;
    private final com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface authentication = null;
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.ui.verizon.VerizonView view) {
    }
    
    @javax.inject.Inject()
    public VerizonPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface database, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface authentication) {
        super();
    }
}