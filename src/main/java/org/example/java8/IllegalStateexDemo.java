package org.example.java8;

public class IllegalStateexDemo  extends  Thread{
    public void run()
    {

        for (int i = 0; i < 5; i++) {

            // Display message
            System.out.println("GeeksForGeeks");
        }
    }

}
class Thred1{
    public static void main(String[] args)
    {
        // creating a thread object  in the main() method
        // of our helper class above
      IllegalStateexDemo t =new IllegalStateexDemo();

        // Starting the above created thread
        // using the start() method
        t.start();
        try {
            System.out.println("Main Thread");

         t.sleep(2000);
            System.out.println("main thread awaken");
        }
        catch (Exception e){
            System.out.println(e);
        }

        // Display Message
        System.out.println("Main Thread");

        // starting the thread again when it is already
        // running and hence it cause an exception
     //   t.start();
    }

}
