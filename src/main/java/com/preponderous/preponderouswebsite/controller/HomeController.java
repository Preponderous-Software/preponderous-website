package com.preponderous.preponderouswebsite.controller;

import com.preponderous.preponderouswebsite.config.PreponderousProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final PreponderousProperties properties;

    @Autowired
    public HomeController(PreponderousProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public String home(Model model) {
        // Company information
        model.addAttribute("welcomeMessage", "Welcome to " + properties.getCompany().getName() + "!");
        model.addAttribute("description", properties.getCompany().getDescription());
        model.addAttribute("githubLink", properties.getCompany().getGithubLink());

        // Add all projects to the model
        model.addAttribute("projects", properties.getProjects());

        return "home";
    }

    @GetMapping("/api/greeting")
    public String greeting(Model model) {
        model.addAttribute("greetingMessage", "Hello from " + properties.getCompany().getName() + "! We're dedicated to fostering collaboration and innovation in open-source software development.");
        return "fragments/greeting :: greetingFragment";
    }
}