package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;

@RestController
public class Create {

    @GetMapping("/")
    public double Input(@RequestParam double x, @RequestParam double y) {

    double result = x*y;
    return result;
}

}
