package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       List<String> names = List.of("nakabayashi","suzuki", "honda","mizuhara","kobayashi");

       List<String> SortedResult = names.stream().sorted().toList();

        long count = names.stream().filter(name -> name.contains("a")).count();

        boolean hasbayashi = names.stream().anyMatch(name -> name.contains("bayashi"));

        System.out.println(SortedResult);
        System.out.println(count);
        System.out.println(hasbayashi);
    }

}