package com.andreikeda.example.mvcpi.java.home.protocols;

import android.os.Bundle;

public interface HomeControllerToPresenterInterface {
    void onCreate(Bundle savedInstanceState);

    void onStart();

    void onResume();

    void onPause();

    void onRestart();

    void onDestroy();

    void setView(HomePresenterToViewInterface view);
}
