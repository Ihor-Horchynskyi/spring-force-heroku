package com.koroka.herokuIntegration.controllers;

import com.koroka.herokuIntegration.data.repositories.VesselRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VesselController {

    @Autowired
    VesselRepository vesselRepository;

    @GetMapping("/status")
    String showAll(Model model) {
        model.addAttribute("vessels", vesselRepository.findAll());
        return "pages/vessels";
    }
}
