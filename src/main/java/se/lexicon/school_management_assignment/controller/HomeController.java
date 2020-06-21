package se.lexicon.school_management_assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/index", ""})
    public String getIndexPage(){
        return "index";
    }

}
