package com.yeter.testapp.dto.Request.Update;

import lombok.Data;

@Data
public class StudentUpdateRequest {
    private int id;
    private String studentName;
    private String studentSurname;
    private String studentGmail;
    private String studentPhone;
}
