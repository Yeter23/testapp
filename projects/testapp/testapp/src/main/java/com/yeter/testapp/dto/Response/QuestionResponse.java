package com.yeter.testapp.dto.Response;

import lombok.Data;

@Data
public class QuestionResponse {
    private int id;
    private String questionName;
    private int levelId;
    private int languageId;
    private int subjectId;
}
