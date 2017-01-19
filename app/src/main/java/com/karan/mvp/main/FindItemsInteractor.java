package com.karan.mvp.main;

/**
 * Created by stpl on 1/19/2017.
 */

import java.util.List;


public interface FindItemsInteractor {

    interface OnFinishedListener {
        void onFinished(List<String> items);
    }

    void findItems(OnFinishedListener listener);
}
