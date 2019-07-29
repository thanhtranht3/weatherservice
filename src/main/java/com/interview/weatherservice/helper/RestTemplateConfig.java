package com.interview.weatherservice.helper;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplateConfig
 * @author thanh.tran
 *
 * */
@Configuration
public class RestTemplateConfig {

    /**
     * Create RestTemplate bean
     * */
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}