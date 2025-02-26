package messages.quoteApi.service;

import messages.quoteApi.model.Quote;
import messages.quoteApi.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;

    public Quote getRandomQuote() {
        List<Quote> quotes = quoteRepository.findAll();
        if (!quotes.isEmpty()) {
            int randomIndex = new Random().nextInt(quotes.size());
            return quotes.get(randomIndex);
        }
        return null;
    }
}