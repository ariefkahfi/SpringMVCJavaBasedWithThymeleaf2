package com.arief.thymeleaf.controllers;

import com.arief.thymeleaf.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {


    @Autowired
    private Person arief;

    @Autowired
    private Person putro;


    @RequestMapping("/hello")
    public String helloPage(Model m){
        m.addAttribute("msg","Hello world");
        return "hello";
    }
}
