package com.yeter.testapp.dto.Request.Update;

import lombok.Data;

@Data
public class QuestionUpdateRequest {
    private int id;
    private String questionName;
    private int levelId;
    private int languageId;
    private int subjectId;
}
