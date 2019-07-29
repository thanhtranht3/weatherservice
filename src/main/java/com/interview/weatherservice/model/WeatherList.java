package com.interview.weatherservice.model;

import java.util.List;
import java.util.Optional;

/**
 * WeatherList
 * @author thanh.tran
 *
 * */
public class WeatherList {
    private Optional<List<WeatherInformation>> list;

    public Optional<List<WeatherInformation>> getList() {
        return list;
    }

    public void setList(Optional<List<WeatherInformation>> list) {
        this.list = list;
    }
}
