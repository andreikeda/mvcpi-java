package com.andreikeda.example.mvcpi.java.home.presenter;

import android.os.Bundle;
import com.andreikeda.example.mvcpi.java.BuildConfig;
import com.andreikeda.example.mvcpi.java.core.facade.HomeFacade;
import com.andreikeda.example.mvcpi.java.core.model.response.GetCurrentWeatherResponse;
import com.andreikeda.example.mvcpi.java.home.interactor.HomeInteractor;
import com.andreikeda.example.mvcpi.java.home.protocols.HomeControllerToPresenterInterface;
import com.andreikeda.example.mvcpi.java.home.protocols.HomeInteractorToPresenterInterface;
import com.andreikeda.example.mvcpi.java.home.protocols.HomePresenterToControllerInterface;
import com.andreikeda.example.mvcpi.java.home.protocols.HomePresenterToInteractorInterface;
import com.andreikeda.example.mvcpi.java.home.protocols.HomePresenterToViewInterface;
import com.andreikeda.example.mvcpi.java.home.protocols.HomeViewToPresenterInterface;
import okhttp3.ResponseBody;

public class HomePresenter implements HomeInteractorToPresenterInterface,
    HomeControllerToPresenterInterface, HomeViewToPresenterInterface {

    private HomePresenterToInteractorInterface interactor;
    private HomePresenterToControllerInterface controller;
    private HomePresenterToViewInterface view;
    private HomeFacade facade;

    public HomePresenter(
        HomePresenterToControllerInterface controller
    ) {
        this.controller = controller;
        interactor = new HomeInteractor(this);
        facade = new HomeFacade();
        facade.setLat(BuildConfig.LAT);
        facade.setLng(BuildConfig.LNG);
    }

    @Override
    public void onFailure(final Throwable stacktrace) {

    }

    @Override
    public void onResponseSuccess(final GetCurrentWeatherResponse response) {
        controller.showCustomView(view, this);
        if (view != null) {
            view.initialize();
            if (response.getLocation() != null) {
                if (response.getLocation().getName() != null) {
                    view.setLocationName(response.getLocation().getName());
                }
                if (response.getLocation().getRegion() != null) {
                    view.setLocationRegion(response.getLocation().getRegion());
                }
            }
            if (response.getCurrent() != null) {
                view.setTemperature(String.valueOf(response.getCurrent().getTempC()));
                view.setUV(String.valueOf(response.getCurrent().getUv()));
                if (response.getCurrent().getCondition() != null) {
                    view.setCondition(response.getCurrent().getCondition());
                }
            }
        }
    }

    @Override
    public void onResponseError(final ResponseBody error) {

    }

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        controller.showLoadingView();
    }

    @Override
    public void onStart() {
        interactor.currentWeather(facade);
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void setView(final HomePresenterToViewInterface view) {
        this.view = view;
    }
}
