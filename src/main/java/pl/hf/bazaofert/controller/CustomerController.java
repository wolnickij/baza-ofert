package pl.hf.bazaofert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.hf.bazaofert.dto.CustomerForm;
import pl.hf.bazaofert.service.CustomerService;

@Controller
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService myService) {
    this.customerService = myService;
    }

    @GetMapping("customer")
    public ModelAndView customerGet(){
        return new ModelAndView("createNewCustomer", "customerForm", new CustomerForm());
    }

    @PostMapping("customer")
    public String customerPost(CustomerForm customerForm){
        customerService.save(customerForm);
        return "redirect:/home";
    }


}
