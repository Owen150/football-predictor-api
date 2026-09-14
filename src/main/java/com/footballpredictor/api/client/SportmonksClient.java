package com.footballpredictor.api.client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class SportmonksClient {
    private final WebClient sportmonksWebClient;

    public String getFixturesByDate(String date) {

        return sportmonksWebClient
                .get()
                .uri(uriBuilder ->
                        uriBuilder
                                .path("/fixtures/date/{date}")
                                .queryParam(
                                        "include",
                                        "participants;scores;state;league;season"
                                )
                                .build(date)
                )
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
