package Lab3.task4;

class Thread2 extends Thread{
    @Override
    public void run() {
        Calculations.pow(2,3);
        Calculations.more(10, 5);

    }
}
