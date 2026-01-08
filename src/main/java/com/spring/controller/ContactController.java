package com.spring.controller;

import com.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class ContactController {

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping(path="/processform",method= RequestMethod.POST)
    public String processForm(@ModelAttribute User user, Model model){
        // @ModelAttribute automatically binds form data to the User object. It can also be used above the method
        model.addAttribute("user",user);
        return "success";
    }

    /*
    @RequestMapping(path="/processform",method= RequestMethod.POST)
    public String processForm(@RequestParam(value = "email")String email, @RequestParam("pwd")String password, Model model){
       User user = new User();
       user.setEmail(email);
         user.setPassword(password);
         model.addAttribute("user",user);
        return "success";
    }
    */
}
