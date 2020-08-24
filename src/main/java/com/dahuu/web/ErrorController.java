package com.gobest.web;

import com.gobest.config.AuthorConfig;
import com.gobest.damain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baylorten
 */
@Controller
public class ErrorController {

    @RequestMapping("/error_page_404")
    String error_page_404() {
        return "404";
    }
}