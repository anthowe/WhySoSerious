package com.raywenderlich.android.whysoserious.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/raywenderlich/android/whysoserious/di/AppComponent;", "", "loginPresenter", "Lcom/raywenderlich/android/whysoserious/presentation/LoginPresenter;", "profilePresenter", "Lcom/raywenderlich/android/whysoserious/presentation/ProfilePresenter;", "registerPresenter", "Lcom/raywenderlich/android/whysoserious/presentation/RegisterPresenter;", "verizonPresenter", "Lcom/raywenderlich/android/whysoserious/presentation/VerizonPresenter;", "welcomePresenter", "Lcom/raywenderlich/android/whysoserious/presentation/WelcomePresenter;", "app_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {com.raywenderlich.android.whysoserious.di.module.PresentationModule.class})
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.whysoserious.presentation.RegisterPresenter registerPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.whysoserious.presentation.LoginPresenter loginPresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.whysoserious.presentation.ProfilePresenter profilePresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.whysoserious.presentation.WelcomePresenter welcomePresenter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.android.whysoserious.presentation.VerizonPresenter verizonPresenter();
}