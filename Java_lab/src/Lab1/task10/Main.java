package Lab1.task10;

public class Main {
        public static void main(final String[] args) {
             final Day [] days = new Day[7];

            days[0] = new Day (NameOfDay.MONDAY,TypeOfWeather.RAINY,18,23.6,3);
            days[1] = new Day (NameOfDay.TUESDAY,TypeOfWeather.FOGGY,10,13.9,6);
            days[2] = new Day (NameOfDay.WEDNESDAY,TypeOfWeather.SNOWY,22,2.5,18);
            days[3] = new Day (NameOfDay.THURSDAY,TypeOfWeather.STORMY,18,13.6,22);
            days[4] = new Day (NameOfDay.FRIDAY,TypeOfWeather.SUNNY,17,22.6,13);
            days[5] = new Day (NameOfDay.SATURDAY,TypeOfWeather.WINDY,-10,13,24);
            days[6] = new Day (NameOfDay.SUNDAY,TypeOfWeather.CLOUDY,12,20,2);


            for(int i=0;i<days.length;i++) {
                System.out.println("-----------");
                System.out.println(days[i]);

            }
        }

        }





