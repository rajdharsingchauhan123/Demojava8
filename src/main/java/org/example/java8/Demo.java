package org.example.java8;

import java.util.StringJoiner;

public class Demo {
    public static void main(String[] args) {
        //StringJoiner stringJoiner=new StringJoiner(",");// comma as , delimiter
        StringJoiner stringJoiner =new StringJoiner(",","[","]");
        StringJoiner stringJoiner2  =new StringJoiner(",","[","]");
        stringJoiner.add("raja");
        stringJoiner.add("promod sir");
        stringJoiner.add("rajdhar");
        System.out.println(stringJoiner);
        stringJoiner2.add("ravikant");
        stringJoiner2.add("badal");
        stringJoiner2.add("sivi");
        // stringJoiner merge
        StringJoiner merge=stringJoiner.merge(stringJoiner2);
        System.out.println(merge);
    }


}
