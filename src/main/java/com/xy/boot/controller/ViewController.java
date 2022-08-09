package com.xy.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/success")
    public String success(Model model){
        model.addAttribute("msg","hello");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }
}
