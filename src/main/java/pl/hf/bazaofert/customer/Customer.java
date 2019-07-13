package pl.hf.bazaofert.customer;

import lombok.Data;
import pl.hf.bazaofert.address.Address;
import pl.hf.bazaofert.offer.Offer;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int customerID;

    private String customerShortName;
    private String customerFullName;
    private String TaxNumber;
    @Embedded
    private Address address;
    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="customer")
    private List<Offer> offers;
}
