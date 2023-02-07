package com.example.mshello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MsHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsHelloApplication.class, args);
        System.out.println("ms-hello is running");
    }





}
