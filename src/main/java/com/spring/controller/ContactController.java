package com.spring.controller;

import com.spring.model.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class ContactController {

    @Autowired
    private UserService userService;

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping(path="/processform",method= RequestMethod.POST)
    public String processForm(@ModelAttribute User user, Model model){
        // @ModelAttribute automatically binds form data to the User object. It can also be used above the method

        if(user.getEmail().isBlank()){
            model.addAttribute("msg","Email cannot be blank");
//            return "redirect:/app/contact";
            return "contact";
        }
        int createdUser = this.userService.createUser(user);
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
