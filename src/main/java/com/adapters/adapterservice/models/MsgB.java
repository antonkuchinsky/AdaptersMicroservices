package com.adapters.adapterservice.models;

import java.time.LocalDateTime;

public record MsgB(
        String txt,
        LocalDateTime createdDt,
        int currentTemp
) {
}
