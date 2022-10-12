package weather;

public class Weather {

    public static void main(String[] args) {

        String cityString = "Ãîğîä: ";
        String cityNameString = "Ëîíäîí";
        String todayWeatherString = "ÒÅÊÓÙÀß ÏÎÃÎÄÀ";
        String tomorrowWeatherString = "ÏĞÎÃÍÎÇ ÏÎÃÎÄÛ ÍÀ ÇÀÂÒĞÀ";
        String temperatureString = "Òåìïåğàòóğà: ";
        String windString = "Âåòåğ: ";
        String humidityString = "Âëàæíîñòü: ";

        int temperatureInt1 = 17;
        int humidityInt1 = 72;
        double windInt1 = 17.2;
        int farengeitInt1 = ((temperatureInt1 * 9/5) + 32);

        int temperatureInt2 = 19;
        int humidityInt2 = 74;
        double windInt2 = 12.7;
        int farengeitInt2 = (temperatureInt2 * 9/5 + 32);

        System.out.println("+-------------------+---------------------------+");
        System.out.println("| " + todayWeatherString + "\t| " + tomorrowWeatherString + "  |");
        System.out.println("+-------------------+---------------------------+");
        System.out.println("| " + cityString + cityNameString + "\t\t| " + cityString + cityNameString + "\t\t\t\t|");
        System.out.println("| " + temperatureString + temperatureInt1 + " C°" + "| "  + temperatureString + temperatureInt2 + " C° \t\t|");
        System.out.println("| " + temperatureString + farengeitInt1 + " F°" + "| "  + temperatureString + farengeitInt2 + " F° \t\t|");
        System.out.println("| " + windString + windInt1 + " ì/ñ" + "\t| " + windString + windInt2 + " ì/ñ" + "\t\t\t|");
        System.out.println("| " + humidityString + humidityInt1 + " %" + "\t| " + humidityString + humidityInt2 + " %" + "\t\t\t|");
        System.out.println("+-------------------+---------------------------+");

        System.out.println("\n URL-address: https://openweathermap.org/weather-conditions");
        System.out.println(" thunderstorm with heavy rain [ID 202] \n overcast clouds: 85-100% [ID 804] \n Shower sleet [ID 613]");
    }
}
