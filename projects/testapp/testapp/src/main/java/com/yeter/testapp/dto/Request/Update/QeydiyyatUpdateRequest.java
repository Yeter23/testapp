package com.yeter.testapp.dto.Request.Update;

import lombok.Data;

@Data
public class QeydiyyatUpdateRequest {
    private int id;
    private String qeydiyyatName;
    private String qeydiyyatSurname;
    private String qeydiyyatGmail;
    private String  qeydiyyatPhone;
}
