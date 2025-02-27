package principale.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import principale.application.model.Conversation;
import principale.application.service.ConversationService;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private ConversationService conversationService;

    @GetMapping("/admin")
    public String showUsers(Model model) {
        List<String> usernames = conversationService.getDistinctUsernames();
        model.addAttribute("usernames", usernames);
        return "admin";
    }

    @GetMapping("/admin/{username}")
    public String showUserConversations(@PathVariable String username, Model model) {
        List<Conversation> conversations = conversationService.getConversationsByUsername(username);
        model.addAttribute("conversations", conversations);
        model.addAttribute("username", username);
        return "user-conversations";
    }
}
