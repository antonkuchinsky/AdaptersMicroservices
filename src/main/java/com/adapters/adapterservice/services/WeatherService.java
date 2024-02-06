package com.adapters.adapterservice.services;

public interface WeatherService {
    String getWeatherData(String latitude, String longitude);
    int parseWeatherData(String weatherData);
}
