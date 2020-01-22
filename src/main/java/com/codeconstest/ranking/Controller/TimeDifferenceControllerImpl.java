package com.codeconstest.ranking.Controller;

import com.codeconstest.ranking.model.TimeRankingDto;
import com.codeconstest.ranking.service.Formatter;
import com.codeconstest.ranking.service.TimeDifferenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalTime;

@RestController
@RequiredArgsConstructor
public class TimeDifferenceControllerImpl implements TimeDifferenceController {

    @Qualifier("timeFormatter")
    final Formatter formatter;

    final TimeDifferenceService timeDifferenceService;

    @Override
    public ResponseEntity<Integer> validateTime(@RequestBody final TimeRankingDto timeRankingDto) {

        LocalTime initialTime = (LocalTime) formatter.format(timeRankingDto.getInitialTime());
        LocalTime endTime = (LocalTime) formatter.format(timeRankingDto.getFinalTime());

        int timeDifference = timeDifferenceService.calculateTimeDifference(initialTime, endTime);
        return ResponseEntity.ok(timeDifference);
    }
}
