package com.education.springbppexample;

public class WeatherForecaster {
    @InjectRandomInt(min = -20, max = 36)
    private int temperature;
    @InjectRandomInt(min = 740, max = 765)
    private int pressure;

    private SKY sky = SKY.SUNNY;

    @Override
    public String toString() {
        return "WeatherForecaster{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                ", sky=" + sky +
                '}';
    }
}
