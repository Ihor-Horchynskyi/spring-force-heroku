package com.koroka.herokuIntegration.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @RequestMapping("/status")
    String getStatus() {
        return "Test status";
    }

    @RequestMapping("/error")
    String getError() {
        return "Errors suck(";
    }
}
