package com.education.springbppexample;

import javax.annotation.PostConstruct;

public class WeatherForecaster {
    @InjectRandomInt(min = -20, max = 36)
    private int temperature;
    @InjectRandomInt(min = 740, max = 765)
    private int pressure;

    private SKY sky ;

    public WeatherForecaster() {
        System.out.println("Phase 1");
        sky = SKY.SUNNY;
        System.out.println(toString());
    }

    @PostConstruct
    public void init(){
        System.out.println("Phase 2");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "WeatherForecaster{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                ", sky=" + sky +
                '}';
    }
}
