package com.nynu.baseseparation.service.serviceImpl;

import com.nynu.baseseparation.service.BaseSeparationService;
import org.springframework.stereotype.Service;

@Service
public class BaseSeparationServiceImpl implements BaseSeparationService {

    @Override
    public String getInfoById(String id) {
        return "OpenFeign - base-separation: " + id;
    }

}
