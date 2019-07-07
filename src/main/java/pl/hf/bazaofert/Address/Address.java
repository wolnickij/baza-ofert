package pl.hf.bazaofert.Address;

import lombok.Data;
import pl.hf.bazaofert.Customer.Country;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Address {
    private String streetNameAndNo;
    private String postalCode;
    private String city;
    private Country country;

}
