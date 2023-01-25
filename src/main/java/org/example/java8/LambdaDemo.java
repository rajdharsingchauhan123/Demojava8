package org.example.java8;

import java.util.ArrayList;

public class LambdaDemo {
    public static void main(String[] args) {

        // usign collection crate lambda
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(23);
        arrayList.add(12);
        arrayList.add(14);
        System.out.println(arrayList);
        arrayList.forEach(n-> System.out.println(n));
    }
}
