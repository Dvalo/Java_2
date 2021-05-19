package guram.dvalishvili.weather;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherServiceLocator {
    public static URL normal_url, city_url;
    public static HttpURLConnection connection1, connection2;

    @PostConstruct
    protected static String apiFinder() throws IOException {
        normal_url = new URL("http://localhost:8080/guram_dvalishvili_davaleba_1_war_exploded/api/weather/");
        connection1 = (HttpURLConnection)normal_url.openConnection();
        connection1.setRequestMethod("GET");
        connection1.connect();

        BufferedReader br = new BufferedReader(new InputStreamReader((connection1.getInputStream())));
        String output;
        System.out.println("Output from Server :  \n");
        while ((output = br.readLine()) != null) {
            return output;
        }
        return null;
    }

    @PostConstruct
    protected static String apiFinder(String cityName) throws IOException {
        city_url = new URL("http://localhost:8080/guram_dvalishvili_davaleba_1_war_exploded/api/weather/"+cityName);
        connection2 = (HttpURLConnection)city_url.openConnection();
        connection2.setRequestMethod("GET");
        connection2.connect();

        BufferedReader br1 = new BufferedReader(new InputStreamReader((connection2.getInputStream())));
        String output1;
        System.out.println("Output from Server :  \n");
        while ((output1 = br1.readLine()) != null) {
            return output1;
        }
        return null;
    }
}
