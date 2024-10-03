package com.yeter.testapp.dto.Response;

import lombok.Data;

@Data
public class StudentsResponse {
    private int id;
    private String studentName;
    private String studentSurname;
    private String studentGmail;
    private String studentPhone;
}
