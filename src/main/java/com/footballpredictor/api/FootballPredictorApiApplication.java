package com.footballpredictor.api;

import com.footballpredictor.api.config.SportmonksProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SportmonksProperties.class)
public class FootballPredictorApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FootballPredictorApiApplication.class, args);
    }

}
