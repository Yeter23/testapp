package com.yeter.testapp.dto.Request.Filter;

import lombok.Data;

@Data
public class QuestionFilterRequest {
private int id;
    private String questionName;
    private int levelId;
    private int languageId;
    private int subjectId;
}
