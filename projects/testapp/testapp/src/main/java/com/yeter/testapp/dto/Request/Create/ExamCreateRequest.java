package com.yeter.testapp.dto.Request.Create;

import lombok.Data;

@Data

public class ExamCreateRequest {
    private int levelId;
    private int subjectId;
    private int languageId;
    private int questionId;
}
