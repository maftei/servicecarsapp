package com.maftraz.servicecarsapp.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clsPrn {

    @RequestMapping(value = "/index")
    public String  firstIndex()
    {
        return "Cars <b>services</b>";
    }
    @RequestMapping("/home")
    String index(){
        //mapped to hostname:port/home/index/
        return "Hello from home";
    }



}
