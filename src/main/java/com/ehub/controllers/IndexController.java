package com.ehub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by AyoubOlk on 30/01/2016.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    String index()
    {
        return "index";
    }
}
