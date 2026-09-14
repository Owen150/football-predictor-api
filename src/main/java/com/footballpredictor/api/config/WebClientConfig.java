package com.footballpredictor.api.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient sportmonksWebClient(
            SportmonksProperties properties
    ) {
        return WebClient.builder()
                .baseUrl(properties.baseUrl())
                .defaultHeader(
                        "Authorization",
                        "Bearer " + properties.apiToken()
                )
                .build();
    }
}
