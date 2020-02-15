package com.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 6:41 下午 2020/2/14
 * @Author: fox
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
