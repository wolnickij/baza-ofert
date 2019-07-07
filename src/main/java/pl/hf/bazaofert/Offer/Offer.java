package pl.hf.bazaofert.Offer;

import lombok.Data;
import pl.hf.bazaofert.Customer.Customer;
import pl.hf.bazaofert.Employee.Employee;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Offer {
    @Id
    @GeneratedValue
    private Long id;
    private String offerNumber;
    private LocalDate offerDate;
    private LocalDate offerValidityDate;
    @ManyToOne
    private Employee personResponsible;
    @ManyToOne
    private Customer customer;
    private OfferStatus offerStatus;
    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="offer")
    private List<OfferPosition> offerPositions;
}
