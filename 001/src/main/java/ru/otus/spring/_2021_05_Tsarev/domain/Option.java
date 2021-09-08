package ru.otus.spring._2021_05_Tsarev.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

public @Data @AllArgsConstructor
class Option {
    private String option;
    private Boolean isRightOption;
}
