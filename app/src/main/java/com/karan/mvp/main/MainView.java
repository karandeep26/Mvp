package com.karan.mvp.main;

/**
 * Created by stpl on 1/19/2017.
 */
import java.util.List;

public interface MainView {

    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
