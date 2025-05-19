package com.example.firstjavaproject.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class controller {
    @GetMapping(value = "/")
    public String hello(){
        return "Caddilac CT5-V Blackwing";
    }
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }
    //http://localhost:8080/greeting?name=Vistula
}
