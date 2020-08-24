package com.gobest.web;

import com.gobest.config.AuthorConfig;
import com.gobest.damain.Message;
import com.gobest.damain.Person;
import com.gobest.damain.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private AuthorConfig author;

    @Value("${author.name}")
    private String name;
    @Value("${author.description}")
    private String description;

    @RequestMapping("/indexAuthor")
    String index() {

        return "Author name is " + author.getName() + ",and description is " + author.getDescription() + ".";
    }

    @RequestMapping("/home")
    String home() {
        return "Hello Spring Boot!";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        Person single = new Person("aa", 11);

        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("xx", 11);
        Person p2 = new Person("yy", 22);
        Person p3 = new Person("zz", 33);
        people.add(p1);
        people.add(p2);
        people.add(p3);

        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);

        return "index";
    }

}