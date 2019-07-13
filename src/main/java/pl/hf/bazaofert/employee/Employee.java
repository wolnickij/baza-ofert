package pl.hf.bazaofert.employee;

import lombok.Data;
import pl.hf.bazaofert.offer.Offer;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int Id;
    private Gender gender;
    private String firstName;
    private String lastName;
    private String eMail;
    private String tablePhoneNumber;
    private String cellPhoneNumber;
    private  JobPosition jobPosition;
    private  String employeeCode;
    @OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="personResponsible")
    private List<Offer> offers;
}
