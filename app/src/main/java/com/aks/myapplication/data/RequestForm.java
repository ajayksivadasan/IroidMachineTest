package com.aks.myapplication.data;

public class RequestForm {
    private String email;
    private String password;
    private String lang_id;
    private String device_token;

    public RequestForm(String email, String password, String lang_id, String device_token) {
        this.email = email;
        this.password = password;
        this.lang_id = lang_id;
        this.device_token = device_token;
    }

    public RequestForm() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLang_id() {
        return lang_id;
    }

    public void setLang_id(String lang_id) {
        this.lang_id = lang_id;
    }

    public String getDevice_token() {
        return device_token;
    }

    public void setDevice_token(String device_token) {
        this.device_token = device_token;
    }
}
