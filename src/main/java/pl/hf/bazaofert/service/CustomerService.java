package pl.hf.bazaofert.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.hf.bazaofert.address.Address;
import pl.hf.bazaofert.dto.CustomerForm;
import pl.hf.bazaofert.entity.Customer;
import pl.hf.bazaofert.repository.CustomerRepository;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public void save(CustomerForm customerForm) {
        final Customer myCustomer = new Customer();
        Address address = new Address(
                customerForm.getStreetNameAndNo(),
                customerForm.getPostalCode(),
                customerForm.getCity(),
                customerForm.getCountry()
        );
        myCustomer.setCustomerShortName(customerForm.getCustomerShortName());
        myCustomer.setCustomerFullName(customerForm.getCustomerFullName());
        myCustomer.setTaxNumber(customerForm.getTaxNumber());
        myCustomer.setAddress(address);
        customerRepository.save(myCustomer);
    }
}