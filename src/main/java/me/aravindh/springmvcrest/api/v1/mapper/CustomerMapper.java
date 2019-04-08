package me.aravindh.springmvcrest.api.v1.mapper;

import me.aravindh.springmvcrest.api.v1.model.CustomerDTO;
import me.aravindh.springmvcrest.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);
}
