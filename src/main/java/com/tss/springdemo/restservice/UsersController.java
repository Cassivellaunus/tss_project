package com.tss.springdemo.restservice;

import com.tss.springdemo.entity.Customer;
import com.tss.springdemo.service.CustomerService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class UsersController {

    final
    CustomerService customerService;

    public UsersController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/getCustomers", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @RequestMapping(value = "/getCustomers/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Customer getCustomerById(@PathVariable(name = "id") int id) {
        return customerService.getCustomer(id);
    }
}
