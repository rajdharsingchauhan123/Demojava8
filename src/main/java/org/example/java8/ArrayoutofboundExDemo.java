package org.example.java8;

public class ArrayoutofboundExDemo {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int b=arr.length;
        System.out.println(b);
        try {
            for (int i=0;i<=arr.length;i++){
                System.out.println(arr[i]);
            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\n exeption caught");

        }

    }
}
