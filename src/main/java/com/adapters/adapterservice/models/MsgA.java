package com.adapters.adapterservice.models;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Object 'MsgA' received from service A")
public record MsgA(
        @Schema(description = "Message received from service A")
        String msg,
        @Schema(description = "Language received from service A")
        String lng,
        @Schema(description = "Coordinates received from service A")
        Coordinates coordinates
) {
}
