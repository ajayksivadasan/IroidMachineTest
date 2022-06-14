package com.aks.myapplication.ui.login;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.aks.myapplication.data.LoginResponse;
import com.aks.myapplication.data.RequestForm;
import com.aks.myapplication.di.scope.ApiInterface;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class LoginRepository {
    ApiInterface apiInterface;

    @Inject
    public LoginRepository(ApiInterface apiInterface) {
        this.apiInterface = apiInterface;
    }

    public void makeApiCall(RequestForm requestForm, CompositeDisposable disposable, MutableLiveData<LoginResponse.UserModel> userModelMutableLiveData) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("data", new Gson().toJson(requestForm));
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("email", requestForm.getEmail())
                .addFormDataPart("password", requestForm.getPassword())
                .addFormDataPart("device_token", requestForm.getDevice_token())
                .addFormDataPart("lang_id", requestForm.getLang_id())
                .build();
        Observable<LoginResponse> observable = apiInterface.getLoginResponse(requestBody);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        disposable.add(d);
                    }

                    @Override
                    public void onNext(LoginResponse loginResponse) {
                        if (loginResponse.getUser() != null) {
                            userModelMutableLiveData.postValue(loginResponse.getUser());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                        Log.e("completed", "login");
                    }
                });
    }
}
