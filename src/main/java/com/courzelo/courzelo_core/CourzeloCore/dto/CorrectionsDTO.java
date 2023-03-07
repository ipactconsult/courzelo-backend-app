package com.courzelo.courzelo_core.CourzeloCore.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CorrectionsDTO {

    String idtrainee;
    Float score;
    public CorrectionsDTO()
    {super();}
}
