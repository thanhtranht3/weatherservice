package com.interview.weatherservice.service;

import com.interview.weatherservice.model.WeatherInformation;
import com.interview.weatherservice.model.Zipcode;
import com.interview.weatherservice.model.ZipcodeList;

import java.util.List;
import java.util.Optional;
/**
 * WeatherService
 * @author thanh.tran
 *
 * */
public interface WeatherService {
    /**Get list zipcode by city and state*/
    Optional<List<String>> getZipCodes(Zipcode cityState);
    /**Get current weather by zipcode */
    Optional<WeatherInformation> getWeather(String zipcode);
    /**Get forecast weather by zipcode */
    Optional<List<WeatherInformation>> getForecast(String zipcode);
}
