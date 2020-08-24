package com.gobest.web;

import java.security.Principal;

import com.gobest.damain.Message;
import com.gobest.damain.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public Response say(Message message) throws Exception {
        Thread.sleep(2000);
        return new Response("Welcome, " + message.getName() + "!");
    }

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) { //2
        if (principal.getName().equals("baylor")) {//3
            messagingTemplate.convertAndSendToUser("tom",
                    "/queue/notifications", principal.getName() + "-send:"
                            + msg);
        } else {
            messagingTemplate.convertAndSendToUser("baylor",
                    "/queue/notifications", principal.getName() + "-send:"
                            + msg);
        }
    }
}