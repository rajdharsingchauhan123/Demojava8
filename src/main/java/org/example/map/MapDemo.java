package org.example.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(1, "raj");
        map.put(2, "r");

        // traversion map
        Set set = map.entrySet();

        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getValue() + "" + entry.getKey());
        }
    }
}