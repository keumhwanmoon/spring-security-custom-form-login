package com.example.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jason, Moon
 * @since 2016-10-06
 */
@Controller
@RequestMapping
public class LoginController {

    @RequestMapping
    public ModelAndView index() {
        return new ModelAndView("/index");
    }

    @RequestMapping("/login-info")
    public ModelAndView loginInfo() {
        return new ModelAndView("/login-info");
    }
}
