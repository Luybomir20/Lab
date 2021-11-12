package Lab1.task4;

import java.lang.String;

class task4 {
    public static void main(final String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0)//Якщо значення і ділиться без остачі на 5 і 3
            {System.out.println("FizzBuzz:" + i);}

            else if (i % 3 == 0)//Якщо значення і ділиться без остачі на  3
            {System.out.println("Fizz:" + i);}

            else if (i % 5 == 0) //Якщо значення і ділиться без остачі на  5
            {System.out.println("Buzz:" + i);}

            else if (i % 3!=0 && i%5!=0) //Якщо значення  ділиться на 3 і 5 з остачею
            {System.out.println("Не кратне 3 і 5: " +i);}
        }
    }
}