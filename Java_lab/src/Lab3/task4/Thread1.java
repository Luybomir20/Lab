package Lab3.task4;

 public class Thread1 extends Thread {
     @Override
     public void run() {
         Calculations.sum(5, 10);
         Calculations.substraction(10, 5);

     }
 }





