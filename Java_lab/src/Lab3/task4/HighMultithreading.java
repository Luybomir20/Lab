package Lab3.task4;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;


public class HighMultithreading {
    public static void main(final String[] args) {
        final ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(() -> Calculations.pow(5, 2));
        executorService.submit(() -> Calculations.sum(5, 2));
        executorService.submit(() -> Calculations.substraction(5, 2));
        executorService.submit(() -> Calculations.more(5, 2));

        try {
            executorService.shutdown();//close
        } catch (final Exception e) {
            executorService.shutdown();
        }
    }
}