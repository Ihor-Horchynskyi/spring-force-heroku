package com.koroka.herokuIntegration.controllers;

import com.koroka.herokuIntegration.data.repositories.VesselRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1.0")
public class VesselsApi {

    @Autowired
    VesselRepository vesselRepository;

    @GetMapping(path = "/vessels/all")
    public String getAllVessels(){
        return vesselRepository.findAll().toString();
    }
}
