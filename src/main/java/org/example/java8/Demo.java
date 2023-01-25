package org.example.java8;

import java.util.StringJoiner;

public class Demo {
    public static void main(String[] args) {
        //StringJoiner stringJoiner=new StringJoiner(",");// comma as , delimiter
        StringJoiner stringJoiner =new StringJoiner(",","[","]");
        stringJoiner.add("raja");
        stringJoiner.add("promod sir");
        stringJoiner.add("rajdhar");
        System.out.println(stringJoiner);
    }
    // adding prefix and suffix
}
