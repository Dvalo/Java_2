package guram.dvalishvili.weather;

import java.io.IOException;

public class WeatherBot {

    public static String answer(String city) throws IOException {
        String result;

        switch (city) {
            case "all":
                result = WeatherServiceLocator.apiFinder();
                break;
            case "Tbilisi":
                result = WeatherServiceLocator.apiFinder(city);
                break;
            case "Batumi":
                result = WeatherServiceLocator.apiFinder(city);
                break;
            case "Kutaisi":
                result = WeatherServiceLocator.apiFinder(city);
                break;
            default:
                result = "Error, wrong city";
        }
        return result;
    }
}
