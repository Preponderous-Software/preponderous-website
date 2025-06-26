package com.preponderous.preponderouswebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("welcomeMessage", "Welcome to Preponderous Software!");
        model.addAttribute("description", "Developing free and open-source games and assets");
        model.addAttribute("githubLink", "https://github.com/Preponderous-Software");
        
        // Project information
        model.addAttribute("project1Name", "Beyond Nations");
        model.addAttribute("project1Description", "A sandbox nation simulation RPG that allows players to explore a procedurally generated world, collect resources, and interact with various entities.");
        
        model.addAttribute("project2Name", "Viron");
        model.addAttribute("project2Description", "A tool for creating and managing virtual environments and entities within those environments, intended for game development and other applications.");
        
        return "home";
    }

    @GetMapping("/api/greeting")
    public String greeting(Model model) {
        model.addAttribute("greetingMessage", "Hello from Preponderous Software! We're dedicated to fostering collaboration and innovation in open-source software development.");
        return "fragments/greeting :: greetingFragment";
    }
}