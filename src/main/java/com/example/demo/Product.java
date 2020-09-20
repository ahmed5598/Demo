package com.example.demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;


@Setter @Getter @NoArgsConstructor
public class Product {
    @Getter(lazy = true)
    private final HashMap<String, Long> transactions = getTransactions();
    private String id;
    private String name;
}