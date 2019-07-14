package pl.hf.bazaofert.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
    @GetMapping("home")
    public ModelAndView get(Authentication authentication) {
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("userName", ((UserDetails) authentication.getPrincipal()).getUsername());
        return modelAndView;
    }

}


