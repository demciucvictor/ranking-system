package com.codeconstest.ranking.Controller;

import javax.validation.Valid;

import com.codeconstest.ranking.model.TimeRankingDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/ranking/time", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public interface TimeDifferenceController {

    @PostMapping(value = "/validate", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    ResponseEntity validateTime(@RequestBody @Valid TimeRankingDto timeRankingDto);

}
