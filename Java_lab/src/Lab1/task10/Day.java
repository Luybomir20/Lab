package Lab1.task10;

public class Day  {
    private Weather weather = new Weather();//Створили об'єкт до погоди
    private NameOfDay nameOfDay;//Connect to enam

    Day(final NameOfDay nameOfDay, final TypeOfWeather typeOfWeather,final int temperature,final double windSpeed,final int humidity){
        this.nameOfDay=nameOfDay;
        this.weather.setTypeOfWeather(typeOfWeather);
        this.weather.setTemperature(temperature);
        this.weather.setWindSpeed(windSpeed);
        this.weather.setHumidity(humidity);


    }
    public Weather getWeather() {

        return weather;
    }

    public void setWeather(final Weather weather) {

        this.weather = weather;
    }

    public NameOfDay getNameOfDay() {

        return nameOfDay;
    }

    public void setNameOfDay(final NameOfDay nameOfDay) {
        this.nameOfDay = nameOfDay;
    }
    @Override
    public String toString() {
        return "Day{" +
               "nameOfDay=" + nameOfDay+" "
                +weather+'}';
    }
}



