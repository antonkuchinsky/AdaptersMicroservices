package com.adapters.adapterservice.models;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Schema(description = "Object sent by adapter service to service B")
public record MsgB(
        @Schema(description = "Text received from adapter service")
        String txt,
        @Schema(description = "Date received from adapter service")
        LocalDateTime createdDt,
        @Schema(description = "Temperature received from adapter service")
        int currentTemp
) {
}
