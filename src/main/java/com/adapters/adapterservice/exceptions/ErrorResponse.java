package com.adapters.adapterservice.exceptions;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ErrorResponse {
    private String message;
    private ZonedDateTime dateTimeError;
}
