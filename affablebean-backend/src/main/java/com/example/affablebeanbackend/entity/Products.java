package com.example.affablebeanbackend.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Data
@NoArgsConstructor
public class Products {
    private List<Product> products = new ArrayList<>();

    public Products(Iterable<Product> iterable) {
        products = StreamSupport.stream(iterable.spliterator(),false).collect(Collectors.toList());
    }
}
