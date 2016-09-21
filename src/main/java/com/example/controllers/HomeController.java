package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Mir on 19/09/2016.
 */
@Controller
public class HomeController {
    @RequestMapping (value="/", method = RequestMethod.GET)
    public String indexPage () {
        return "index";
    }
}
