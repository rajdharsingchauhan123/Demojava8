package org.example.java8;

public class StackoverflowexDemo {
    static int i = 0;
    public static int printNumber(int x)
    {

        i = i + 2;
        System.out.println(i);

        // Terminating condition
        if (i == 10)
            return i;

        return i + printNumber(i + 2);
    }

    public static void main(String[] args) {
        StackoverflowexDemo.printNumber(i);
    }

}
