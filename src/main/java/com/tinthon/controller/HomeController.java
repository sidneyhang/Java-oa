package com.tinthon.controller;

import com.tinthon.beans.Spitter;
import com.tinthon.repository.SpitterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by sidney on 2017/1/8.
 */

@Controller
public class HomeController {

    @Autowired
    SpitterRepo spitterRepo;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        Spitter spitter = spitterRepo.findByUsername("habuma");
        model.addAttribute("email", spitter.getEmail());

        System.out.println(spitter.getEmail());
        return "home";
    }
}
