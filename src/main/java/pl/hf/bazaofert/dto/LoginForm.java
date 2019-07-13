package pl.hf.bazaofert.dto;

import lombok.Data;

@Data
public class LoginForm {
    private String login;
    private String password;
}