package com.codeconstest.ranking.Controller;

import com.codeconstest.ranking.model.TimeRankingDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping("/time")
public interface TimeDifferenceController {

    @PostMapping(value = "/1", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    ResponseEntity<Integer> validateTime(@RequestBody TimeRankingDto timeRankingDto);

}
