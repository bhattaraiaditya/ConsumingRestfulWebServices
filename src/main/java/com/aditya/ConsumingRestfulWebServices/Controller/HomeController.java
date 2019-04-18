package com.aditya.ConsumingRestfulWebServices.Controller;

import com.aditya.ConsumingRestfulWebServices.Domain.Greeting;
import com.aditya.ConsumingRestfulWebServices.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/fetch_greeting_data")

public class HomeController {

    private final HomeService homeService;

    @Autowired
    public HomeController(HomeService homeService){
        this.homeService=homeService;
    }

    @GetMapping
    public Greeting fetchGreetingData(){
        return homeService.fetchGreetingInfo();
    }

}
