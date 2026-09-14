package com.footballpredictor.api.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    // WebClientConfig class is a Spring configuration class that defines a bean for the WebClient used to interact with the Sportmonks API. It uses the SportmonksProperties to configure the base URL and API token for the WebClient.
    // A WebClient is a non-blocking, reactive client for making HTTP requests in Spring applications. In this configuration, the WebClient is set up with the base URL and authorization header required to access the Sportmonks API.
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
