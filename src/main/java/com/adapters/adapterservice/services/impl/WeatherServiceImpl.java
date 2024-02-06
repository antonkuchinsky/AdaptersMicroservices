package com.adapters.adapterservice.services.impl;

import com.adapters.adapterservice.services.WeatherService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceImpl implements WeatherService {
    private final String TOMORROW_URL = "https://api.tomorrow.io/v4/weather/realtime";
    private final String TOMORROW_TOKEN = "60FALyOhgrXzhtXzKPHgmZei6RQrHl48";

    @Override
    public String getWeatherData(String latitude, String longitude) {
        String apiUrl = TOMORROW_URL + "?location=" + latitude + "," +longitude + "&apikey="+TOMORROW_TOKEN;
        return callWeatherApi(apiUrl);
    }

    @Override
    public int parseWeatherData(String weatherData) {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(weatherData, JsonObject.class);
        JsonObject data = jsonObject.getAsJsonObject("data");
        JsonObject values = data.getAsJsonObject("values");
        double temperature = values.get("temperature").getAsDouble();
        return (int) temperature;
    }

    private String callWeatherApi(String apiUrl) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
