package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("index.html");
        return mav;
    }
}
