package com.footballpredictor.api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "sportmonks")
public record SportmonksProperties(
        String baseUrl,
        String apiToken
) {
}