package com.andreikeda.example.mvcpi.java.core.request;

import com.andreikeda.example.mvcpi.java.core.model.response.GetCurrentWeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("current.json")
    Call<GetCurrentWeatherResponse> getCurrentWeather(@Query("key") String key, @Query("q") String q);
}
