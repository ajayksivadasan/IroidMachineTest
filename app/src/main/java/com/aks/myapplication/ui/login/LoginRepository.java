package com.aks.myapplication.ui.login;

import com.aks.myapplication.di.scope.ApiInterface;

import javax.inject.Inject;

public class LoginRepository {
    ApiInterface apiInterface;

    @Inject
    public LoginRepository(ApiInterface apiInterface) {
        this.apiInterface = apiInterface;
    }
}
