package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo1 {
    public static void main(String[] args) {
        Map<String, Integer> hm
                = new HashMap<String, Integer>();

        // Inserting pairs in above Map
        // using put() method
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));

        // traversing the map
        for(Map.Entry<String,Integer>me:hm.entrySet()){
            System.out.println(me.getValue());
            System.out.println(me.getKey());
        }

    }
}
