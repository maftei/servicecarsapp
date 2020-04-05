package com.maftraz.servicecarsapp.service;

import com.maftraz.servicecarsapp.model.clsCustomer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class clsCustomerService {

    private List<clsCustomer> customerList = new CopyOnWriteArrayList<>();

    private int customerIdcount = 1;

    public clsCustomer addCustomer(clsCustomer customer) {
        customer.setCustomerId(customerIdcount);
        customerList.add(customer);
        customerIdcount++;
        return customer;
    }

    public List<clsCustomer> getCustomerList() {

        return customerList;
    }

    public clsCustomer getCustomer(int customerId) {
        return customerList
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();
    }


    public clsCustomer updateCustomer(int customerId, clsCustomer customer) {
        customerList
                .stream()
                .forEach(c ->
                {
                    if (c.getCustomerId() == customerId) {
                        c.setCustomerFirstName(customer.getCustomerFirstName());
                        c.setCustomerLastName(customer.getCustomerLastName());
                        c.setCustomerEmail(customer.getCustomerEmail());
                    }
                });

        return customerList
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();
    }

    public void deleteCustomer(int customerId) {
        customerList
                .stream()
                .forEach(c -> {
                    if (c.getCustomerId() == customerId) {
                        customerList.remove(c);
                    }
                });
    }

//       public List<clsCustomer> allCustomers() {
//          return allCustomers();
//    }
    //#6 Spring Boot Tutorial - Adding a Service Layer de revazut

}
