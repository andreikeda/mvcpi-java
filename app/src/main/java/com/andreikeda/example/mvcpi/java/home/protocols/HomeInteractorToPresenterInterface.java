package com.andreikeda.example.mvcpi.java.home.protocols;

import com.andreikeda.example.mvcpi.java.core.model.response.GetCurrentWeatherResponse;
import okhttp3.ResponseBody;

public interface HomeInteractorToPresenterInterface {
    void onFailure(Throwable stacktrace);

    void onResponseSuccess(GetCurrentWeatherResponse response);

    void onResponseError(ResponseBody error);
}
