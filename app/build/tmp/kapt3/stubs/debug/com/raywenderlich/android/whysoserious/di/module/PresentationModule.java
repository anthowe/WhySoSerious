package com.raywenderlich.android.whysoserious.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/raywenderlich/android/whysoserious/di/module/PresentationModule;", "", "()V", "loginPresenter", "Lcom/raywenderlich/android/whysoserious/presentation/LoginPresenter;", "Lcom/raywenderlich/android/whysoserious/presentation/implementation/LoginPresenterImpl;", "profilePresenter", "Lcom/raywenderlich/android/whysoserious/presentation/ProfilePresenter;", "profilePresenterImpl", "Lcom/raywenderlich/android/whysoserious/presentation/implementation/ProfilePresenterImpl;", "registerPresenter", "Lcom/raywenderlich/android/whysoserious/presentation/RegisterPresenter;", "Lcom/raywenderlich/android/whysoserious/presentation/implementation/RegisterPresenterImpl;", "welcomePresenter", "Lcom/raywenderlich/android/whysoserious/presentation/WelcomePresenter;", "welcomePresenterImpl", "Lcom/raywenderlich/android/whysoserious/presentation/implementation/WelcomePresenterImpl;", "app_debug"})
@dagger.Module(includes = {com.raywenderlich.android.whysoserious.di.module.InteractionModule.class})
public abstract class PresentationModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.raywenderlich.android.whysoserious.presentation.LoginPresenter loginPresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.presentation.implementation.LoginPresenterImpl loginPresenter);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.raywenderlich.android.whysoserious.presentation.RegisterPresenter registerPresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.presentation.implementation.RegisterPresenterImpl registerPresenter);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.raywenderlich.android.whysoserious.presentation.ProfilePresenter profilePresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.presentation.implementation.ProfilePresenterImpl profilePresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.raywenderlich.android.whysoserious.presentation.WelcomePresenter welcomePresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.presentation.implementation.WelcomePresenterImpl welcomePresenterImpl);
    
    public PresentationModule() {
        super();
    }
}