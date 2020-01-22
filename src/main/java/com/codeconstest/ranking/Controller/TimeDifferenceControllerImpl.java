package com.codeconstest.ranking.Controller;

import java.time.LocalTime;

import javax.validation.Valid;

import com.codeconstest.ranking.model.TimeRankingDto;
import com.codeconstest.ranking.service.Formatter;
import com.codeconstest.ranking.service.TimeDifferenceService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TimeDifferenceControllerImpl implements TimeDifferenceController{

    @Qualifier("timeFormatter")
    final Formatter formatter;

    final TimeDifferenceService timeDifferenceService;

    @Override
    public ResponseEntity validateTime(@RequestBody @Valid final TimeRankingDto timeRankingDto) {

        LocalTime initialTime = (LocalTime) formatter.format(timeRankingDto.getInitialTime());
        LocalTime endTime = (LocalTime) formatter.format(timeRankingDto.getFinalTime());

        int timeDifference = timeDifferenceService.calculateTimeDifference(initialTime, endTime);
        return ResponseEntity.ok(timeDifference);
    }
}
