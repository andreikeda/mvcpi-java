package com.andreikeda.example.mvcpi.java.home.interactor;

import com.andreikeda.example.mvcpi.java.BuildConfig;
import com.andreikeda.example.mvcpi.java.core.facade.HomeFacade;
import com.andreikeda.example.mvcpi.java.core.model.response.GetCurrentWeatherResponse;
import com.andreikeda.example.mvcpi.java.core.request.WeatherService;
import com.andreikeda.example.mvcpi.java.home.protocols.HomeInteractorToPresenterInterface;
import com.andreikeda.example.mvcpi.java.home.protocols.HomePresenterToInteractorInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.internal.EverythingIsNonNull;

public class HomeInteractor implements HomePresenterToInteractorInterface {

    private HomeInteractorToPresenterInterface presenter;
    private WeatherService service;

    public HomeInteractor(
        HomeInteractorToPresenterInterface presenter
    ) {
        this.presenter = presenter;
        Gson gson = new GsonBuilder()
            .setLenient()
            .create();

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();

        service = retrofit.create(WeatherService.class);
    }

    @Override
    public void currentWeather(final HomeFacade facade) {
        final Callback<GetCurrentWeatherResponse> cb = new Callback<GetCurrentWeatherResponse>() {
            @EverythingIsNonNull
            @Override
            public void onResponse(final Call<GetCurrentWeatherResponse> call,
                final Response<GetCurrentWeatherResponse> response) {
                if (response.isSuccessful()) {
                    presenter.onResponseSuccess(response.body());
                } else {
                    presenter.onResponseError(response.errorBody());
                }
            }

            @EverythingIsNonNull
            @Override
            public void onFailure(final Call<GetCurrentWeatherResponse> call, final Throwable t) {
                presenter.onFailure(t);
            }
        };
        service.getCurrentWeather(
            BuildConfig.API_KEY,
            facade.getCoordinates()
        ).enqueue(cb);
    }
}
