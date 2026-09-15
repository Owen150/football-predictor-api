package com.footballpredictor.api.controller;
import com.footballpredictor.api.client.SportmonksClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/fixtures")
@RequiredArgsConstructor
public class FixtureController {
    private final SportmonksClient sportmonksClient;

    @GetMapping("/today")
    public String getTodayFixtures() {

        return sportmonksClient.getFixturesByDate(
                LocalDate.now().toString()
        );
    }
}
