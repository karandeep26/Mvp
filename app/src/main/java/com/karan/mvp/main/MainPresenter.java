package com.karan.mvp.main;

/**
 * Created by stpl on 1/19/2017.
 */

public interface MainPresenter {

    void onResume();

    void onItemClicked(int position);

    void onDestroy();
}
