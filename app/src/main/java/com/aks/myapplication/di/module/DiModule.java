package com.aks.myapplication.di.module;

import com.aks.myapplication.di.scope.ApiInterface;
import com.aks.myapplication.utils.RetrofitNetwork;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;

@InstallIn(SingletonComponent.class)
@Module
public class DiModule {
    @Provides
    @Singleton
    public Retrofit providesRetrofitInstance() {
        return RetrofitNetwork.getRetrofitInstance();
    }

    @Provides
    @Singleton
    public ApiInterface providesApiInterface(Retrofit retrofit) {
        return retrofit.create(ApiInterface.class);
    }
}
