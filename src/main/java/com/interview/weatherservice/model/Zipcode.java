package com.interview.weatherservice.model;

import javax.validation.constraints.*;
/**
 * Zipcode
 * @author thanh.tran
 *
 * */
public class Zipcode {
    @NotBlank
    @Size(max = 1024)
    @Pattern(regexp = "[a-zA-Z ]+")
    private String city;
    @NotBlank
    @Pattern(regexp = "[a-zA-Z]{2}")
    private String state;
    private String zipcode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
