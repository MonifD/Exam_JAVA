package messages.quoteApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import messages.quoteApi.model.Quote;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer>{

}
