package org.example.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {

    public static void main(String[] args) {

        Map<String, Integer> items = new HashMap<>();
        items.put("coins", 5);
        items.put("pens", 2);
        items.put("chairs", 7);

        Collection<Integer> vals = items.values();


        vals.forEach(System.out::println);
    }
}
