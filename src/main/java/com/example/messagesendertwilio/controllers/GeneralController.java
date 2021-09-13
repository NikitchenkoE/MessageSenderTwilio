package com.example.messagesendertwilio.controllers;

import com.example.messagesendertwilio.services.MessagingService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@AllArgsConstructor
public class GeneralController {

    private final MessagingService messagingService;

    @GetMapping("/")
    public String generalPage() {
        log.info("Showed general page");
        return "general_page";
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam(value = "reciver", required = false) String reciverNumber,
                              @RequestParam(value = "message",required = false) String message){
        messagingService.sandMessage(reciverNumber,message);
        return "redirect:/";
    }
}
