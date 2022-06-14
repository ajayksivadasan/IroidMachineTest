package com.aks.myapplication.di.scope;

import com.aks.myapplication.data.LoginResponse;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {
    @POST("api/v1/login")
    Observable<LoginResponse> getLoginResponse(@Body RequestBody body);
}
