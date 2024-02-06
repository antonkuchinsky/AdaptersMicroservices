package com.adapters.adapterservice.models;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Coordinates received from service A")
public record Coordinates(
        @Schema(description = "Latitude received from service A")
        String latitude,
        @Schema(description = "Longitude received from service A")
        String longitude
) {
}
