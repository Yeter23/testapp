package com.yeter.testapp.dto.Response;

import lombok.Data;

@Data
public class ResultsResponse {
    private int id;
    private int registeredId;
    private int examId;
    private int correctcount;
    private int wrongcount;
    private int result;
}
