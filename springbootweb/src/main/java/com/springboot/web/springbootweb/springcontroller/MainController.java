package com.springboot.web.springbootweb.springcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")  
    public String home() {
        System.out.println("Home Page Requested");
        return "home";  
    }

    @GetMapping("/contact")
    public String contact(){
        System.out.println("Contact Page Requested");
        return "contact";
    }
}
