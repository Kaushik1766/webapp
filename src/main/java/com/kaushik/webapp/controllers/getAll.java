package com.kaushik.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaushik.webapp.models.Product;

@RestController
public class getAll {
    @GetMapping("/getAll")
    public Product test() {
        Product product = new Product("a", "asdf", 1232.3);

        return product;
    }
}
