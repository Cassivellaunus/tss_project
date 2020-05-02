package com.tss.springdemo.service;

import com.tss.springdemo.dao.CustomerDAO;
import com.tss.springdemo.entity.Customer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerService {

    private final CustomerDAO customerDAO;

    public CustomerServiceImplementation(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.saveCustomer(customer);
    }
}
