package pl.hf.bazaofert.deliveryConditions;

import lombok.Data;
import pl.hf.bazaofert.address.Address;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class DeliveryConditions {
    Incoterms incoterms;
    Address deliveryAddress;
}
