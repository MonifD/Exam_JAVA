package principale.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import principale.application.model.Conversation;
import principale.application.service.ConversationService;

@Controller
public class ConversationController {
    @Autowired
    private ConversationService conversationService;

    @GetMapping("/chat")
    public String showChat() {
        return "conversation";
    }

    @PostMapping("/chat")
    public String handleMessage(@RequestParam String username, @RequestParam String message, Model model) {
        Conversation conversation = conversationService.saveConversation(username, message);
        model.addAttribute("response", conversation.getResponse());
        return "conversation";
    }
}
