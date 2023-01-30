package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapusingLambdaDemo {
    public static void main(String[] args) {
        Map<String, Integer> ranks = new HashMap<String, Integer>();
        ranks.put("India", 1);
        ranks.put("Australia", 2);
        ranks.put("England", 3);
        ranks.put("Newzealand", 4);
        ranks.put("South Africa", 5);
        // Iterating through
       // forEach using Lambda Expression
        ranks.forEach((k,v) -> System.out.println("Team : " + k + ", Rank : " + v));
}}
