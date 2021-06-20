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
    @RequestMapping("/home")
    public String index(Model model) {
        return "home/home";
    }

    @RequestMapping("/custom")
    public String custom(Model model) {
        return "home/custom";
    }

    @RequestMapping("/contactus")
    public String contactus(Model model) {
        return "home/contactus";
    }

    @RequestMapping("/products")
    public String products(Model model) {
        return "home/products";
    }
}
