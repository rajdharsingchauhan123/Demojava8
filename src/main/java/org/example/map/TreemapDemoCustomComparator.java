package org.example.map;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreemapDemoCustomComparator {
    public static void main(String[] args) {


        SortedMap<String,String>fileExtensions=new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s, String s1) {
             return s.compareTo(s1);
            }
        });
        fileExtensions.put("python", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("kotlin", ".kt");
        fileExtensions.put("golang", ".go");
        fileExtensions.put("java", ".java");
        System.out.println(fileExtensions);
    }

}
