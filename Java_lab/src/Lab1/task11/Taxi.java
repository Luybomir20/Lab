package Lab1.task11;
import java.util.Objects;

public class Taxi {
     Driver driver;//Підключили водіїв

     String colorCar;
     String brand;
     int numberOfSeats;

    public Taxi(final String colorCar, final String brand, final int numberOfSeats) {
        this.colorCar = colorCar;
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(final Driver driver) {
        this.driver = driver;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(final String colorCar) {
        this.colorCar = colorCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(final int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Taxi taxi = (Taxi) o;
        return numberOfSeats == taxi.numberOfSeats && Objects.equals(colorCar, taxi.colorCar) && Objects.equals(brand, taxi.brand);
    }

    @Override
    public int hashCode() {

        return Objects.hash(colorCar, brand, numberOfSeats);
    }
}
