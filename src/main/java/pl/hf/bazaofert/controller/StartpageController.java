package pl.hf.bazaofert.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;

public class StartpageController {
    @GetMapping("/")
    public View startPageGet() {
        return new JstlView("index");
    }
}
