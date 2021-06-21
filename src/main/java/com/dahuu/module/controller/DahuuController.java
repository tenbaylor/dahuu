package com.dahuu.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author baylorten
 */
@RequestMapping("/")
@Controller
public class DahuuController {

    /**
     * 首页
     */
    @RequestMapping("/index")
    public String index(Model model) {
        return "home/index";
    }

    @RequestMapping("/custom")
    public String custom(Model model) {
        return "home/custom";
    }

    @RequestMapping("/about")
    public String about(Model model) {
        return "home/about";
    }

    @RequestMapping("/goods")
    public String products(Model model) {
        return "home/goods";
    }
}
