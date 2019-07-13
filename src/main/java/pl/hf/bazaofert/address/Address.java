package pl.hf.bazaofert.address;

import lombok.Data;
import pl.hf.bazaofert.customer.Country;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Address {
    private String streetNameAndNo;
    private String postalCode;
    private String city;
    private Country country;

}
