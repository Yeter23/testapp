package com.yeter.testapp.dto.Request.Filter;

import lombok.Data;

@Data
public class ExamFilterRequest {
    private int id;
    private int levelId;
    private int subjectId;
    private int languageId;
    private int questionId;
}
