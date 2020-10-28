package com.andreikeda.example.mvcpi.java.home.protocols;

public interface HomePresenterToControllerInterface {
    void showCustomView(
        HomePresenterToViewInterface view,
        HomeViewToPresenterInterface presenter
    );
    void showLoadingView();
}
