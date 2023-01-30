package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapoperationDemo {
    public static void main(String[] args) {

        // Map
        Map<Integer, String> hm1 = new HashMap<>();

        // Initialization of a Map
        // using Generics
        Map<Integer, String> hm2
                = new HashMap<Integer, String>();

        // Inserting the Elements
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");

        hm2.put(new Integer(1), "Geeks");
        hm2.put(new Integer(2), "For");
        hm2.put(new Integer(3), "Geeks");

        // add value in java hm1 map
        hm1.put(new Integer(4),"raj");

        System.out.println(hm1);
        System.out.println(hm2);

    }
}
