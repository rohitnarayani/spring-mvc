package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("msg", "Welcome to the Home Page!");
        model.addAttribute("phno",9428900845L);

        List<String> friends = new ArrayList<>();
        friends.add("Alice");
        friends.add("Bob");
        friends.add("Charlie");
        model.addAttribute("friends", friends);

        return "home";
    }
}
