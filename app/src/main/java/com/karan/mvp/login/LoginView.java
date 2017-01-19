package com.karan.mvp.login;

/**
 * Created by stpl on 1/19/2017.
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
