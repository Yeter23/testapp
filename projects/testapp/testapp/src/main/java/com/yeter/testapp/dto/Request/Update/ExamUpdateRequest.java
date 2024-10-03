package com.yeter.testapp.dto.Request.Update;

import lombok.Data;

@Data
public class ExamUpdateRequest {
    private int id;
    private int levelId;
    private int subjectId;
    private int languageId;
    private int questionId;
}
