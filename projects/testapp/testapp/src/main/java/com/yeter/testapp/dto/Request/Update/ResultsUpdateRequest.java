package com.yeter.testapp.dto.Request.Update;

import lombok.Data;

@Data
public class ResultsUpdateRequest {
    private int id;
    private int registeredId;
    private int examId;
    private int correctcount;
    private int wrongcount;
    private int result;

}
