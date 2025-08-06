package com.example.mvparchitecture;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LoginPresenter {
    private LoginInterface loginInterface;

    public void login(User user) {
        if (user.isValidEmail() && user.isValidPassword()) {
//            System.out.println("Login successfully");
            loginInterface.loginSuccess();
        } else {
//            System.out.println("Email or Password invalid");
            loginInterface.loginError();
        }
    }
}
