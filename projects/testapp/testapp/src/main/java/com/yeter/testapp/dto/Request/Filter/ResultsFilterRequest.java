package com.yeter.testapp.dto.Request.Filter;

import lombok.Data;

@Data
public class ResultsFilterRequest {
    private int id;
    private int registeredId;
    private int examId;
    private int correctcount;
    private int wrongcount;
    private int result;
}
