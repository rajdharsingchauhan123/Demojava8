package org.example.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        System.out.println("the main");
        byValue cmp = new byValue();
        Map<String, Integer> map = new TreeMap<String, Integer>();
        map.put("de",10);
        map.put("ab", 20);
        map.put("a",5);

        for (Map.Entry<String,Integer> pair: map.entrySet()) {
            System.out.println(pair.getKey()+":"+pair.getValue());
        }
    }

}
class byValue implements Comparator<Map.Entry<String,Integer>>{

    @Override
    public int compare(Map.Entry<String, Integer> t1, Map.Entry<String, Integer> t2) {
        if (t1.getValue()<t2.getValue()){
            return 1;
        } else if (t1.getValue()==t2.getValue()) {
            return 0;
            
        }
        else
            return -1;
    }
}
