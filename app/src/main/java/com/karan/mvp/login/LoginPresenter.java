package com.karan.mvp.login;

/**
 * Created by stpl on 1/19/2017.
 */


public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
