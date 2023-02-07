package com.example.msnumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("numbers")
@SpringBootApplication
public class MsNumberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsNumberApplication.class, args);
        System.out.println("ms-number is running");
    }

    @GetMapping()
    public int getNumber() {
        return new Random().nextInt(101);
    }


}
