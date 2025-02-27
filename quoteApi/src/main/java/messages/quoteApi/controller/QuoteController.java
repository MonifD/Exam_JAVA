package messages.quoteApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import messages.quoteApi.service.QuoteService;

@RestController
@RequestMapping("/api")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("/getQuote")
    public String getQuote() {
        return quoteService.getRandomQuote();
    }
    
    
//    @GetMapping("/getQuote")
//    public String getQuote(Model model) {
//        String randomQuote = quoteService.getRandomQuote();
//        model.addAttribute("randomQuote", randomQuote); // Ajouter la citation au modèle
//        return "displayQuotes"; // Retourner le nom de la template
//    }
}
