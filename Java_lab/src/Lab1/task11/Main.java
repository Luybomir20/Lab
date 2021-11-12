package Lab1.task11;

import java.util.Scanner;
public class Main {
public static  void main(final String[] args) {

 final Scanner dist=new Scanner(System.in);

 final Taxi taxi1= new Taxi("Black","BMW",4);
 final Taxi taxi2=new Taxi("Blue","Mersedes",8);
 final Taxi taxi3=new Taxi("Green","Hyndai",4);

 final Driver driver1=new Driver("Vladislav",380931261690l,true);
 final Driver driver2=new Driver("Andrey",380935641949l,true);
 final Driver driver3=new Driver("Luybomir",380662567152l,true);

 taxi1.driver=driver1;
 taxi2.driver=driver2;
 taxi3.driver=driver3;

final Order order1 =new Order();
final Order order2=new Order();
final Order order3=new Order();

 System.out.println("Enter the distance:");
   final int dist1=dist.nextInt();
 System.out.println("Enter the distance:");
   final int dist2=dist.nextInt();
 System.out.println("Enter the distance:");
  final int dist3=dist.nextInt();

order1.pricechek(dist1);

order2.pricechek(dist2);

order3.pricechek(dist3);

order1.numberOfSeats(taxi1);
order1.finish(taxi1);
 System.out.println("----");
order2.numberOfSeats(taxi2);
order2.finish(taxi2);
 System.out.println("----");
order3.numberOfSeats(taxi3);
order3.finish(taxi3);





}
}
