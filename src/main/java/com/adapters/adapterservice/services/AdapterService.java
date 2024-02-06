package com.adapters.adapterservice.services;

import com.adapters.adapterservice.models.MsgA;
import com.adapters.adapterservice.models.MsgB;

public interface AdapterService {
    MsgB processMessage(MsgA msgA);
}
