package com.yeter.testapp.dto.Request.Create;

import lombok.Data;

@Data
public class ResultsCreateRequest {
    private int registeredId;
private int examId;
private int correctcount;
private int wrongcount;
private int result;
}
