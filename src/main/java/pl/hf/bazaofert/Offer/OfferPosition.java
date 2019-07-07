package pl.hf.bazaofert.Offer;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class OfferPosition {
    @ManyToOne
    private Offer offer;

    @Id
    @GeneratedValue
    Long id;
    String offerPosition;

}
