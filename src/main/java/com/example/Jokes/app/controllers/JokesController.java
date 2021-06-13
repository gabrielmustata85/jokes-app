package com.example.Jokes.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.Jokes.app.services.JokesService;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String showJokes(Model model){

        model.addAttribute("jokes", jokesService.getJoke());

        return "index";

    }
}
