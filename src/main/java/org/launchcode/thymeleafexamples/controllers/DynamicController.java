package org.launchcode.thymeleafexamples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/dynamic")
public class DynamicController {
    @GetMapping
    public String getDynamicExample(Model model) {
        model.addAttribute("firstName", "Paul");
        model.addAttribute("lastName", "Matthews");
        return "examples/dynamic";
    }
}
