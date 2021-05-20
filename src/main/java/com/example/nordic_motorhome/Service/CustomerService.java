package com.example.nordic_motorhome.Service;

import com.example.nordic_motorhome.Model.Customer;
import com.example.nordic_motorhome.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;

    public List<Customer> showCustomer(){
        return customerRepo.showCustomer();
    }

    public Boolean deleteCustomer(int customer_id){
        return customerRepo.deleteCustomer(customer_id);
    }
}
