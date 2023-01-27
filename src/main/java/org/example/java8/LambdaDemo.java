package org.example.java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaDemo {
    public static void main(String[] args) {

        // usign collection crate lambda
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(23);
        arrayList.add(12);
        arrayList.add(14);
        System.out.println(arrayList);
     //   arrayList.forEach(n-> System.out.println(n));

        //using consumer
        Consumer<Integer>method=(n)-> System.out.println(n);
        arrayList.forEach(method);


    }
}
