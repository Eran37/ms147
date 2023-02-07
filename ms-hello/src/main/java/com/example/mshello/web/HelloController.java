package com.example.mshello.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("hello")
@RequiredArgsConstructor
public class HelloController {

    private final RestTemplate restTemplate;

    @Value("${url.ms.numbers}")
    private String URL;

    @GetMapping
    public int getNumber(){
        return restTemplate.getForObject(URL, int.class);
    }

}
