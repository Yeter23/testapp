package com.yeter.testapp.dto.Response;

import lombok.Data;

@Data
public class ExamResponse {
    private int id;
    private int levelId;
    private int subjectId;
    private int languageId;
    private int questionId;
}
