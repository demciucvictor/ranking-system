package com.codeconstest.ranking.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class TimeDifferenceServiceImpl implements TimeDifferenceService{

    @Override
    public int calculateTimeDifference(final LocalTime initialTime, final LocalTime endTime) {

        int initialTimeSeconds = timeToSeconds(initialTime);
        int endTimeSeconds = timeToSeconds(endTime);

        return endTimeSeconds - initialTimeSeconds;
    }

    private int timeToSeconds(LocalTime localTime){
        return localTime.getHour()*3600 + localTime.getMinute()*60 + localTime.getSecond();
    }
}
