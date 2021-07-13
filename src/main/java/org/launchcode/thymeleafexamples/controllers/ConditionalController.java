package org.launchcode.thymeleafexamples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/conditional")
public class ConditionalController {
    @GetMapping
    public String getConditionalExample(Model model) {
        model.addAttribute("shouldBuild", true);
        model.addAttribute("buildDiv", true);
        return "examples/conditionals";
    }
}
