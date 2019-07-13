package pl.hf.bazaofert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.hf.bazaofert.dto.LoginForm;
import pl.hf.bazaofert.dto.UserForm;
import pl.hf.bazaofert.service.UserService;


@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService myService) {
        this.userService = myService;
    }

    @GetMapping("register")
    public ModelAndView registerGet() {
        return new ModelAndView("createNewUser", "userForm", new UserForm());
    }

    @GetMapping("login")
    public ModelAndView loginGet() {
        return new ModelAndView("login", "loginForm", new LoginForm());
    }

    @PostMapping("register")
    public String registerPost(@ModelAttribute UserForm userForm) {
        userService.save(userForm.getLogin(), userForm.getPassword());
        return "redirect:/home";
    }
}

