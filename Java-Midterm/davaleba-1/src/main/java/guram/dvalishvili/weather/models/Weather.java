package guram.dvalishvili.weather.models;

public class Weather {
    DirectionType windDirection;
    int windSpeed;
    String cityName;
    int pressure;
    int temperature;
    int humidity;

    public Weather(DirectionType windDirection, int windSpeed, String cityName, int pressure, int temperature, int humidity) {
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.cityName = cityName;
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public DirectionType getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(DirectionType windDirection) {
        this.windDirection = windDirection;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
