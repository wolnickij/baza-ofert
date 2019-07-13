package pl.hf.bazaofert.dto;

import lombok.Data;
import pl.hf.bazaofert.customer.Country;

@Data
public class CustomerForm {
    private String customerShortName;
    private String customerFullName;
    private String TaxNumber;
    private String streetNameAndNo;
    private String postalCode;
    private String city;
    private Country country;
}


