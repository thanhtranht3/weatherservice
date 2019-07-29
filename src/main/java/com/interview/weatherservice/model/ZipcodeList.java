package com.interview.weatherservice.model;

import java.util.List;
import java.util.Optional;

/**
 * ZipcodeList
 * @author thanh.tran
 *
 * */
public class ZipcodeList {
    private Optional<List<String>> zip_codes;

    public Optional<List<String>> getZip_codes() {
        return zip_codes;
    }

    public void setZip_codes(Optional<List<String>> zip_codes) {
        this.zip_codes = zip_codes;
    }
}
