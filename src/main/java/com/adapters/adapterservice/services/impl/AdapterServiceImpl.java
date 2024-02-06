package com.adapters.adapterservice.services.impl;

import com.adapters.adapterservice.exceptions.EmptyMessageException;
import com.adapters.adapterservice.models.MsgA;
import com.adapters.adapterservice.models.MsgB;
import com.adapters.adapterservice.services.AdapterService;
import com.adapters.adapterservice.services.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AdapterServiceImpl implements AdapterService {
    private final WeatherService weatherService;

    @Override
    public MsgB processMessage(MsgA msgA) {
        if (msgA.msg() == null || msgA.msg().isEmpty()) {
            throw new EmptyMessageException("Message field is empty");
        }
        if ("ru".equals(msgA.lng())) {
            String weatherData = weatherService.getWeatherData(msgA.coordinates().latitude(), msgA.coordinates().longitude());

            return new MsgB(msgA.msg(), LocalDateTime.now(),weatherService.parseWeatherData(weatherData));
        } else {
            return null;
        }
    }

}
