package Lab3.task4;

public class Calculations {

    static void sum(final int a,final int b){
        System.out.println("Sum:"+(a+b));
    }

    static void substraction(final int a,final int b){
        System.out.println("Substraction:"+(a-b));
    }

    static void pow(final int value,final int powValue){
        System.out.println("Power:"+(int)Math.pow(value,powValue));
    }

    static void more(final int a,final int b){
        if(a>b){
            System.out.println("a more b");
        }
        else if(a==b){
            System.out.println("a and b are the same");
        }
        else{
            System.out.println("a less b");
        }
    }



}
