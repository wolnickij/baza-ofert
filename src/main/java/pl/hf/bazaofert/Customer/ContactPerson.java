package pl.hf.bazaofert.Customer;

import lombok.Data;
import pl.hf.bazaofert.Employee.Gender;

@Data
public class ContactPerson {
    private Gender gender;
    private String firstName;
    private String lastName;
    private String eMail;
    private String tablePhoneNumber;
    private String cellPhoneNumber;
    private  String jobPosition;

}
