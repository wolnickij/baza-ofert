package pl.hf.bazaofert.dto;

import lombok.Data;

@Data
public class UserForm {
    private String login;
    private String password;
    private String name;
    private String surname;
}

