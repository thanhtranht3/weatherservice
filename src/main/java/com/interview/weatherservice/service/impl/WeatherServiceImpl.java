package com.interview.weatherservice.service.impl;

import com.interview.weatherservice.model.WeatherInformation;
import com.interview.weatherservice.model.WeatherList;
import com.interview.weatherservice.model.Zipcode;
import com.interview.weatherservice.model.ZipcodeList;
import com.interview.weatherservice.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
/**
 * WeatherServiceImpl
 * @author thanh.tran
 * */

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private Environment env;

    @Autowired
    private RestTemplate rest;

    public Optional<List<String>> getZipCodes(Zipcode cityState){
        final String uri = env.getProperty("zipcode.url") + "/"+ env.getProperty("zipcode.apikey") + "/city-zips.json/"
                + cityState.getCity() + "/" + cityState.getState();
        ZipcodeList zipcodes = rest.getForObject(uri, ZipcodeList.class);
        return zipcodes.getZip_codes();
    }

    public Optional<WeatherInformation> getWeather(String zipcode){
        final String uri =  env.getProperty("openweathermap.current.url") + "?zip=" + zipcode + ",us&appid=" + env.getProperty("openweathermap.apikey");
        WeatherInformation weather = rest.getForObject(uri, WeatherInformation.class);
        return Optional.of(weather);
    }

    public Optional<List<WeatherInformation>> getForecast(String zipcode){
        final String uri = env.getProperty("openweathermap.forecast.url") + "?zip=" + zipcode + "&appid=" + env.getProperty("openweathermap.apikey");
        WeatherList weathers = rest.getForObject(uri, WeatherList.class);
        return weathers.getList();
    }

}
