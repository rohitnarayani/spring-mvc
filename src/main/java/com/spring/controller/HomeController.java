package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")
public class HomeController {
    @RequestMapping(path="/home" ,method=RequestMethod.GET)
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

    @RequestMapping("/help")
    public ModelAndView help(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "Jakkad Bangdu");
        modelAndView.addObject("rollno", 12345);
        LocalDateTime now = LocalDateTime.now();
        modelAndView.addObject("time", now);
        List<String> friends = new ArrayList<>();
        friends.add("Alice");
        friends.add("Bob");
        friends.add("Charlie");
        modelAndView.addObject("friends", friends);
        modelAndView.setViewName("help");
        return modelAndView;
    }

    @RequestMapping(path = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {
        model.addAttribute("msg", "Signup page");
        return "signup";
    }

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("msg", "This is index page");
        return "index";

    }

    @RequestMapping(path = "/days" , method = RequestMethod.GET)
    public String days(Model model){
        List<String> days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        model.addAttribute("days", days);
        return "days";
    }
}