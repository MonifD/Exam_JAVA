package messages.quoteApi.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import messages.quoteApi.model.Quote;
import messages.quoteApi.repository.QuoteRepository;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;

    public String getRandomQuote() {
        List<Quote> quotes = quoteRepository.findAll();
        if (quotes.isEmpty()) {
            return "No quotes available";
        }
        Random random = new Random();
        return quotes.get(random.nextInt(quotes.size())).getQuote();
    }
}