package com.interview.weatherservice.controller;

import com.interview.weatherservice.model.WeatherInformation;
import com.interview.weatherservice.model.Zipcode;
import com.interview.weatherservice.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * WeatherController
 * @author thanh.tran
 *
 * */

@RestController
public class WeatherController {

   @Autowired
   WeatherService ws;

   @PostMapping("/weather")
   public List<WeatherInformation> getZipcodes(@Valid @RequestBody Zipcode cityState){
      List<WeatherInformation> weather = new ArrayList<>();
      try{
         // get list zipcode by city and state
         Optional<List<String>> zipcodes = ws.getZipCodes(cityState);

         //get current and forecast weather information by list zipcode
         zipcodes.ifPresent(zip->zip.forEach(z -> {
            ws.getWeather(z).ifPresent(weather::add);
            ws.getForecast(z).ifPresent(weather::addAll);
         }));
      } catch(Exception e) {
         System.out.println("Error happenning: " + e.getMessage());
      }
      return weather;
   }
}
