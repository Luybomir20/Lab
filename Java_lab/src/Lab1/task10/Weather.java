package Lab1.task10;

import java.util.Objects;

public class Weather {
    private TypeOfWeather typeOfWeather;//Conect to enam

    private int temperature;
    private double windSpeed;
    private int humidity; //Вологість



    public int getTemperature() {

        return temperature;
    }

    public void setTemperature(final int temperature) {

        this.temperature = temperature;
    }

    public double getWindSpeed() {

        return windSpeed;
    }

    public void setWindSpeed(final double windSpeed) {

        this.windSpeed = windSpeed;
    }

    public int getHumidity() {

        return humidity;
    }

    public void setHumidity(final int humidity) {

        this.humidity = humidity;
    }

    public TypeOfWeather getTypeOfWeather() {

        return typeOfWeather;
    }

    public void setTypeOfWeather(final TypeOfWeather typeOfWeather) {

        this.typeOfWeather = typeOfWeather;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Weather weather = (Weather) o;
        return Double.compare(weather.windSpeed, windSpeed) == 0 && humidity == weather.humidity && Objects.equals(temperature, weather.temperature) && typeOfWeather == weather.typeOfWeather;
    }

    @Override
    public int hashCode() {

        return Objects.hash(temperature, windSpeed, humidity, typeOfWeather);
    }

    @Override
    public String toString() {
        return "Weather{" +
                "typeofweather=" + typeOfWeather +
                ", temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", humidity=" + humidity +
                '}';
    }
}


