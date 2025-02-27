package principale.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import principale.application.model.Conversation;
import principale.application.repository.ConversationRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ConversationService {
    @Autowired
    private ConversationRepository conversationRepository;

    @Autowired
    private QuoteService quoteService;

    // Enregistrer une conversation
    public Conversation saveConversation(String username, String message) {
        String response = quoteService.getRandomQuote();

        Conversation conversation = new Conversation();
        conversation.setUsername(username);
        conversation.setMessage(message);
        conversation.setResponse(response);
        conversation.setTimestamp(LocalDateTime.now());

        return conversationRepository.save(conversation);
    }

    // Récupérer les conversations d'un utilisateur
    public List<Conversation> getConversationsByUsername(String username) {
        return conversationRepository.findByUsername(username);
    }

    // Récupérer la liste des utilisateurs distincts
    public List<String> getDistinctUsernames() {
        return conversationRepository.findDistinctUsernames();
    }
}