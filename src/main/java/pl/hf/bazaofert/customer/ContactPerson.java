package pl.hf.bazaofert.customer;

import lombok.Data;
import pl.hf.bazaofert.employee.Gender;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class ContactPerson {
    @Id
    @GeneratedValue
    private Gender gender;
    private String firstName;
    private String lastName;
    private String eMail;
    private String tablePhoneNumber;
    private String cellPhoneNumber;
    private  String jobPosition;

}
