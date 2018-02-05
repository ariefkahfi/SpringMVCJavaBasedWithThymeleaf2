package com.arief.thymeleaf.controllers;

import com.arief.thymeleaf.models.Car;
import com.arief.thymeleaf.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class ConditionalController {

    @Autowired
    @Qualifier("putro")
    private Person arief;

    @Autowired
    private Car ferrari;

    @ModelAttribute("testPerson")
    public Person p1(){
        return new Person();
    }





    @RequestMapping("/if-unless")
    public String ifUnlessView(Model m ){
        m.addAttribute("arief",arief);
        m.addAttribute("car",ferrari);
        return "pages/conditonal";
    }

    @RequestMapping("/switch-case")
    public String switchCaseView(Model m){
        m.addAttribute("booleanVal",true);
        m.addAttribute("person",new Person("Arief",null));
        m.addAttribute("integerVal",5);
        return "pages/switch-case";
    }

}
