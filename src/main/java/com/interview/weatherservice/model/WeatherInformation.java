package com.interview.weatherservice.model;

import java.util.Date;
import java.util.List;

/**
 * WeatherInformation
 *
 * @author thanh.tran
 *
 * */
public class WeatherInformation {
    private Date dt;
    private Object wind;
    private List<Object> weather;
    public Date getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = new Date(dt*1000);
    }

    public Object getWind() {
        return wind;
    }

    public void setWind(Object wind) {
        this.wind = wind;
    }

    public List<Object> getWeather() {
        return weather;
    }

    public void setWeather(List<Object> weather) {
        this.weather = weather;
    }


}
