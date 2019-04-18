package com.aditya.ConsumingRestfulWebServices.Service;

import com.aditya.ConsumingRestfulWebServices.Domain.Greeting;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeServiceImpl implements HomeService {
    private final RestTemplate restTemplate;

    public HomeServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Greeting fetchGreetingInfo() {
        return restTemplate.getForObject("http://localhost:8080/greeting?name=aditya",Greeting.class);
    }
}
