package com.codeconstest.ranking.service;

import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component("timeFormatter")
public class TimeFormatter implements Formatter<LocalTime, String> {

    @Override
    public LocalTime format(final String input) {

        int hours;
        int minutes;
        int seconds;
        String[] splitTime = input.split(":");

        if(splitTime.length!=3){
            throw new IllegalArgumentException();
        }

        hours = Integer.parseInt(splitTime[0]);
        minutes = Integer.parseInt(splitTime[1]);
        seconds = Integer.parseInt(splitTime[2]);

        return LocalTime.of(hours, minutes, seconds);
    }
}
