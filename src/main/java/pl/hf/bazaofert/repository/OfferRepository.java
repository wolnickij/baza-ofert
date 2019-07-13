package pl.hf.bazaofert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.hf.bazaofert.offer.Offer;

import java.util.Optional;

public interface OfferRepository extends JpaRepository<Offer, Long> {
    Optional<Offer> findByCustomer (String customerName);
    Optional<Offer> findByCustomerContaining (String customerPartOfTheName);
    Optional<Offer> findByOfferNumber(String offerNumber);
    Optional<Offer> findByOfferNumberContaining (String offerPartOfTheName);
}
