package com.yeter.testapp.dto.Request.Filter;

import lombok.Data;

@Data
public class QeydiyyatFilterRequest {
    private int id;
    private String qeydiyyatName;
    private String qeydiyyatSurname;
    private String qeydiyyatGmail;
    private String  qeydiyyatPhone;
}
