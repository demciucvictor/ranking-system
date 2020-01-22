package com.codeconstest.ranking.model;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TimeRankingDto {

    @NotBlank
    String initialTime;

    @NotBlank
    String finalTime;

}
