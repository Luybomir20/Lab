package Lab3.task4;

public class LowMultithreading {
    public static void main(final String[] args) {
       final Thread1 thread1=new Thread1();
       final Thread2 thread2=new Thread2();

        thread1.start();
        thread2.start();

    }
}
