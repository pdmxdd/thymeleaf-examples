package org.launchcode.thymeleafexamples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/static")
public class StaticController {

    @GetMapping
    public String getStaticExample() {
        return "examples/static";
    }
}
