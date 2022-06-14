package com.aks.myapplication.data;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class LoginResponse {
    @SerializedName("status")
    private boolean status;
    @SerializedName("code")
    private int code;
    @SerializedName("message")
    private String message;
    @SerializedName("blocked")
    private int blocked;
    @SerializedName("user")
    private UserModel user;
    @SerializedName("plan_active_status")
    private boolean planActiveStatus;

    public static LoginResponse objectFromData(String str) {

        return new Gson().fromJson(str, LoginResponse.class);
    }

    public static String dataFromObject(LoginResponse object) {
        return new Gson().toJson(object);
    }

    public static List<LoginResponse> arrayLoginResponseFromData(String str) {

        Type listType = new TypeToken<ArrayList<LoginResponse>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getBlocked() {
        return blocked;
    }

    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public boolean isPlanActiveStatus() {
        return planActiveStatus;
    }

    public void setPlanActiveStatus(boolean planActiveStatus) {
        this.planActiveStatus = planActiveStatus;
    }

    public static class UserModel {
        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;
        @SerializedName("first_name")
        private String firstName;
        @SerializedName("middle_name")
        private String middleName;
        @SerializedName("last_name")
        private String lastName;
        @SerializedName("email")
        private String email;
        @SerializedName("phone")
        private String phone;
        @SerializedName("alternative_phone")
        private String alternativePhone;
        @SerializedName("gender")
        private String gender;
        @SerializedName("image")
        private String image;
        @SerializedName("status")
        private int status;
        @SerializedName("blocked")
        private int blocked;
        @SerializedName("created_at")
        private String createdAt;
        @SerializedName("updated_at")
        private String updatedAt;
        @SerializedName("access_token")
        private String accessToken;

        public static UserModel objectFromData(String str) {

            return new Gson().fromJson(str, UserModel.class);
        }

        public static String dataFromObject(UserModel object) {
            return new Gson().toJson(object);
        }

        public static List<UserModel> arrayUserModelFromData(String str) {

            Type listType = new TypeToken<ArrayList<UserModel>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAlternativePhone() {
            return alternativePhone;
        }

        public void setAlternativePhone(String alternativePhone) {
            this.alternativePhone = alternativePhone;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getBlocked() {
            return blocked;
        }

        public void setBlocked(int blocked) {
            this.blocked = blocked;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }
    }
}
