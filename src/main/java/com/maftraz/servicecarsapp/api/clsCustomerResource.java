package com.maftraz.servicecarsapp.api;

import com.maftraz.servicecarsapp.model.clsCustomer;
import com.maftraz.servicecarsapp.service.clsCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")

public class clsCustomerResource {

    @Autowired
    private clsCustomerService customerService;

    @PostMapping
    public clsCustomer addCustomer(@RequestBody clsCustomer customer)
    {
        return customerService.addCustomer(customer);
    }

    @GetMapping
    public List<clsCustomer> getCustomerList()
    {
        return customerService.getCustomerList();
    }

    @GetMapping(value = "/{customerId}")
    public clsCustomer getCustomer(@PathVariable("customerId") int customerId)
    {
        return customerService.getCustomer(customerId);
    }

    @PutMapping(value = "/{customerId}")
    public clsCustomer updateCustomer(@PathVariable("customerId") int customerId, @RequestBody clsCustomer customer)
    {
        return customerService.updateCustomer(customerId, customer);
    }


}
