package com.story.storybook.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RootController {

    @GetMapping("/")
    String home(Model model) {

        return "home";
    }

    @GetMapping("/create")
    String create(Model model) {

        return "create";
    }

    @GetMapping("/context")
    String context(Model model) {

        return "context";
    }
}

