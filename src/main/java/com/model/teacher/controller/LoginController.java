package com.model.teacher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author swj
 * @create 2019-11-12 17:18
 */
@RequestMapping("/teacher")
@Controller
class TeaLoginController {

    @RequestMapping("/login")
    public String login() {
        return "teacher/login";
    }

    @RequestMapping("/home")
    public String home() {
        return "teacher/home";
    }

}