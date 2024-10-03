package com.yeter.testapp.dto.Request.Filter;

import lombok.Data;

@Data
public class StudentFilterRequest {
    private int id;
    private String studentName;
    private String studentSurname;
    private String studentGmail;
    private String studentPhone;
}
