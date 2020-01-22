package com.codeconstest.ranking.service;

import java.time.LocalTime;

public interface TimeDifferenceService {

    int calculateTimeDifference(LocalTime initialTime, LocalTime endTime);

}
