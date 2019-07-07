package pl.hf.bazaofert.Employee;

import lombok.Data;

@Data
public class Employee {
    private Gender gender;
    private String firstName;
    private String lastName;
    private String eMail;
    private String tablePhoneNumber;
    private String cellPhoneNumber;
    private  JobPosition jobPosition;
    private  String employeeCode;
}
