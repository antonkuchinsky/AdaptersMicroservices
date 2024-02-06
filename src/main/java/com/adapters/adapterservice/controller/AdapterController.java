package com.adapters.adapterservice.controller;

import com.adapters.adapterservice.models.MsgA;
import com.adapters.adapterservice.models.MsgB;
import com.adapters.adapterservice.services.AdapterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/adapter")
@Tag(name = "Adapter Controller", description = "Adapter service API")
public class AdapterController {
    private final AdapterService adapterService;

    @PostMapping("/processMessage")
    @Operation(summary = "Method for transforming an object from service A")
    public MsgB processMessage(@RequestBody MsgA msg) {
        return adapterService.processMessage(msg);
    }

}
