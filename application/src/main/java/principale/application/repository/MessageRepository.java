package principale.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import principale.application.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
