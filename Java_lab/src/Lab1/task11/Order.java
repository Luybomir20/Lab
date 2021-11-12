package Lab1.task11;

import java.util.Objects;

public class Order {
     Taxi taxi;
     Driver driver;


    int price;
    int distkm;
    int pricekm;

    public void numberOfSeats(final Taxi taxi){
         if(!taxi.driver.ready)
        {
            System.out.println("There are no free drivers");
        }
        else if(taxi.numberOfSeats>4 && taxi.driver.ready) {
            System.out.println("There are drivers available for a specified number of seats:" + "Order started " + "Price:{" + price + "} Your driver:{" + taxi.driver.name + "} driver number:{" + taxi.driver.drivernumbers + "}" + " ColorCar:{" + taxi.colorCar + "}" + " Brand:{" + taxi.brand + "}" + "Numberofseats:{" + taxi.numberOfSeats + "}");
            taxi.driver.ready = false;
        }

        else if (taxi.numberOfSeats<=4 && taxi.driver.ready) {
            System.out.println("Order started "+"Price:{"+price+"} Your driver:{"+taxi.driver.name+"} driver number:{"+taxi.driver.drivernumbers+"}"+" ColorCar:{"+taxi.colorCar+"}"+" Brand:{"+taxi.brand+"}");
            taxi.driver.ready=false;
        }

    }




    public void pricechek(final int distkm) {
        if (distkm <= 10) {
            pricekm = 1;
            price=distkm*pricekm;
        } else if (distkm > 10) {
            pricekm = 2;
            price=distkm*pricekm;
        } else if (distkm > 20) {
            pricekm = 3;
            price=distkm*pricekm;
        }
    }

    public void finish(final Taxi taxi){
        if(!taxi.driver.ready)
        {
            System.out.println("Order finished");
            taxi.driver.ready=true;
        }
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(final Taxi taxi) {
        this.taxi = taxi;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(final Driver driver) {
        this.driver = driver;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    public int getDistkm() {
        return distkm;
    }

    public void setDistkm(final int distkm) {
        this.distkm = distkm;
    }

    public int getPricekm() {
        return pricekm;
    }

    public void setPricekm(final int pricekm) {
        this.pricekm = pricekm;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Order order = (Order) o;
        return price == order.price && distkm == order.distkm && pricekm == order.pricekm && Objects.equals(taxi, order.taxi) && Objects.equals(driver, order.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxi, driver, price, distkm, pricekm);
    }
}


