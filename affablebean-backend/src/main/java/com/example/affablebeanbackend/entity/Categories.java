package com.example.affablebeanbackend.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Data
@NoArgsConstructor
public class Categories {
    private List<Category> categories = new ArrayList<>();

    public Categories(Iterable<Category> iterable) {
        categories = StreamSupport.stream(iterable.spliterator(),false).collect(Collectors.toList());
    }

}
