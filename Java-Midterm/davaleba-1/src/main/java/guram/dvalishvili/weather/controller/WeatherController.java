package guram.dvalishvili.weather.controller;

import guram.dvalishvili.weather.models.DirectionType;
import guram.dvalishvili.weather.models.Weather;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;


@Path("/")
public class WeatherController {
    public List<Weather> weatherList = new ArrayList<>();

    public WeatherController() {
        weatherList.add(new Weather(DirectionType.EAST,20,"Tbilisi", 70, 20, 15));
        weatherList.add(new Weather(DirectionType.WEST,20,"Batumi", 72, 25, 11));
        weatherList.add(new Weather(DirectionType.EAST,20,"Kutaisi", 71, 22, 12));
    }

    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getWeather() {
        return weatherList;
    }


    @GET
    @Path("/weather/{city}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getWeather(@PathParam("city") String cityName) {
        for (int i = 0; i<weatherList.size(); i++) {
            if (weatherList.get(i).getCityName().equals(cityName)) {
                return weatherList.get(i);
            }
        }
        return null;
    }

}