package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

    @RequestMapping("/one")
    public RedirectView one(){
        System.out.println("This is first handler method");

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://google.com");
        return redirectView;
        //redirect: prefix is used to redirect to another handler method
//        return "redirect:/two";
    }

    @RequestMapping("/two")
    public String two(){
        System.out.println("This is second handler method");
        return "signup";
    }

}
