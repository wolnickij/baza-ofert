package pl.hf.bazaofert.DeliveryConditions;

import lombok.Data;
import pl.hf.bazaofert.Address.Address;

@Data
public class DeliveryConditions {
    DeliveryConditions deliveryConditions;
    Address deliveryAddress;
}
