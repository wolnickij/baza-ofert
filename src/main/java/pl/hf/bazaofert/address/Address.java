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

    public Address(String streetNameAndNo, String postalCode, String city, Country country) {
        this.streetNameAndNo = streetNameAndNo;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public Address() {
    }
}
