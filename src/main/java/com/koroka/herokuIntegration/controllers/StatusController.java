package com.koroka.herokuIntegration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StatusController {

    @GetMapping("pages/status")
    String getStatus(Model model) {
        return "status";
    }

}
