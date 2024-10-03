package com.yeter.testapp.dto.Request.Create;

import lombok.Data;

@Data
public class QuestionCreateRequest {
    private String questionName;
    private int levelId;
    private int languageId;
    private int subjectId;
}
