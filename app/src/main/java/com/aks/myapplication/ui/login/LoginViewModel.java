package com.aks.myapplication.ui.login;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.aks.myapplication.data.LoginResponse;
import com.aks.myapplication.data.RequestForm;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.disposables.CompositeDisposable;

@HiltViewModel
public class LoginViewModel extends ViewModel {
    @Inject
    LoginRepository loginRepository;
    CompositeDisposable disposable;
    private final MutableLiveData<LoginResponse.UserModel> userModelMutableLiveData;

    @Inject
    public LoginViewModel() {
        disposable = new CompositeDisposable();
        userModelMutableLiveData = new MutableLiveData<>();
    }

    public MutableLiveData<LoginResponse.UserModel> getUserModelMutableLiveData() {
        return userModelMutableLiveData;
    }

    public void makeApiCall(String username, String passWord) {
        RequestForm requestForm = new RequestForm();
        requestForm.setEmail(username);
        requestForm.setPassword(passWord);
        requestForm.setLang_id("en");
        requestForm.setDevice_token("sss");
        loginRepository.makeApiCall(requestForm, disposable, userModelMutableLiveData);
    }
}
