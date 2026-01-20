package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {

    @RequestMapping(path="/demo",method=RequestMethod.GET)
    public String demo(){
        return "form";
    }

    @RequestMapping("/welcome")
    public String welcome(@RequestParam("name")String name, Model model){
        System.out.println(name);
        model.addAttribute("name", name);
        return "welcome";
    }
}
