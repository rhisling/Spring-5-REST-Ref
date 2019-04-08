package me.aravindh.springmvcrest.services;

import me.aravindh.springmvcrest.api.v1.model.CategoryDTO;
import me.aravindh.springmvcrest.api.v1.model.CustomerDTO;


import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);

}