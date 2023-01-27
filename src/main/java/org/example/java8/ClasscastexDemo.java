package org.example.java8;

public class ClasscastexDemo {
    public static void main(String[] args) {
        try {
          String s ="hello";
          Object o =(Object)s;

            //Object o =new Object();
           // String s =(String) o;

            System.out.println(o);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
