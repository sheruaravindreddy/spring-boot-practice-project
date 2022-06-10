package com.example.springboottutorial.controllers;

import com.example.springboottutorial.models.UsersModel;
import com.example.springboottutorial.repositories.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@Controller
public class UsersController {

    @Autowired
    private UsersRepo users_repository;

    @GetMapping(value = "/contact-us")
    public String handleGetRequest(Model model){
        System.out.println("Loading Contact-Us HTML...");
        return "contact_us.jsp";
    }

    @PostMapping(value="/contact-us",
            consumes = {"application/x-www-form-urlencoded"},
            produces = {"application/json", "application/xml"})
    public String handlePostRequest(UsersModel user, Model model){
        System.out.println("Entered post url...");
        HashMap<String, String> contact_us_map = user.generateMap();
        model.addAttribute("contact_us_map",contact_us_map);
        this.users_repository.save(user);
        return "display.jsp";
    }

//    @PostMapping(value="/contact-us")
//    public String handlePostRequest(
//            @RequestParam("inputName") String name,
//            @RequestParam("inputEmail") String email,
//            Model model){
//        model.addAttribute("name",name);
//        model.addAttribute("email", email);
//        System.out.println("Entered post url...");
//        return "display.jsp";
//    }
}
