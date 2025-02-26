package principale.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class MessageService {

	private final RestTemplate restTemplate;

    @Autowired
    public MessageService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getRandomQuote() {
        String apiUrl = "http://localhost:8080/getQuote"; // URL de l'API quoteApi
        return restTemplate.getForObject(apiUrl, String.class);
    }
}