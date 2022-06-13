package com.aks.myapplication.ui.login;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.disposables.CompositeDisposable;

@HiltViewModel
public class LoginViewModel extends ViewModel {
    @Inject
    LoginRepository loginRepository;
    CompositeDisposable disposable;

    @Inject
    public LoginViewModel() {
        disposable = new CompositeDisposable();
    }
}
