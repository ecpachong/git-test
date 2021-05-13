package net.miniec.boot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/world")
    public String world(){
        return  "world";
    }
}
