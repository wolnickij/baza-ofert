package pl.hf.bazaofert.Customer;

import lombok.Data;
import pl.hf.bazaofert.Address.Address;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Customers {
    @Id
    @GeneratedValue
    private int customerID;

    private String customerShortName;
    private String customerFullName;
    private String TaxNumber;
    @Embedded
    private Address address;
}
