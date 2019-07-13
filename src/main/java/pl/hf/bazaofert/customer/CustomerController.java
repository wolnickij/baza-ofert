package pl.hf.bazaofert.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {

    public CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

//    @PostMapping("/customers")
//    @ResponseStatus(HttpStatus.CREATED)
//    public @ResponseBody customer addCustomer(@RequestBody customer customer){return new customer();}
////
//    @DeleteMapping("/customers")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
String appName = "Ala ma kota";
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "customers";

}}
