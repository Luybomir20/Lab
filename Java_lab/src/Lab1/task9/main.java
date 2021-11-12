package Lab1.task9;

import java.util.Scanner;

    public class main {
        public static void main(final String[] args) throws Exception {
            final Scanner scanner = new Scanner (System.in);
            System.out.print("Enter number1: ");
            final double number1 = scanner.nextDouble ();
            System.out.print("Enter number2: ");
            final double number2 = scanner.nextDouble ();
            System.out.print("Enter +,  -, *, / ");
            final char char1 = (char) System.in.read ();

            /////////////////////////////////////////////////////////////////////////

            System.out.println (calculator.calculatorChange (number1,number2,char1));

        }
    }

