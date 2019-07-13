package pl.hf.bazaofert.offer;

import lombok.Data;
import pl.hf.bazaofert.deliveryConditions.DeliveryConditions;
import pl.hf.bazaofert.product.ProductPipe;

import javax.persistence.*;

@Data
@Entity
public class OfferPosition {
    @ManyToOne
    private Offer offer;

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private ProductPipe pipe;
    private float quantityInMeters;
    private float quantityInTonnes;
    private float quantityInPieces;
    private float pipePrice;
    private Currency currency;
    @Embedded
    private DeliveryConditions deliveryConditions;
}
