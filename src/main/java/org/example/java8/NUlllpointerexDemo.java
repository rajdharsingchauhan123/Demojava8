package org.example.java8;

public class NUlllpointerexDemo {
    public static void main(String[] args) {
        String ptr = null;
        try {


            if (ptr.equals("gfg"))
                System.out.println("same object");
            else
                System.out.println("not same");
        }
        catch (NullPointerException e){
        System.out.println("null pointer exeption in cought");
    }
}}
