package org.launchcode.thymeleafexamples.controllers;

import org.launchcode.thymeleafexamples.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/loop")
public class LoopController {
    @GetMapping
    public String getLoopExample(Model model) {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Sally");
        studentNames.add("Carly");
        studentNames.add("Chris");
        model.addAttribute("studentNames", studentNames);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Paul", "Matthews"));
        students.add(new Student("Julia", "Drummond"));
        model.addAttribute("students", students);
        return "examples/loops";
    }
}
