package com.codeconstest.ranking.model;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class TimeRankingDto {

    @NotBlank
    String initialTime;

    @NotBlank
    String finalTime;

}
