package pl.hf.bazaofert.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserForm {
    @NotNull
    @Size(min = 3, max = 30, message = "Nazwa użytkownika musi zawierać od 3 do 30 znaków")
    private String login;
    @NotNull
    @Size(min = 3, max = 30, message = "Hasło musi zawierać od 3 do 30 znaków")
    private String password;
    @NotNull
    @Size(min = 3, max = 30, message = "Imię musi zawierać od 3 do 30 znaków")
    private String name;
    @NotNull
    @Size(min = 3, max = 30, message = "Nazwisko musi zawierać od 3 do 30 znaków")
    private String surname;
}

