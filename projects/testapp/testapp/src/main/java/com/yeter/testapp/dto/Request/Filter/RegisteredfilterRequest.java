package com.yeter.testapp.dto.Request.Filter;

import lombok.Data;

@Data
public class RegisteredfilterRequest {
private int id;
    private String username;
    private int password;
    private boolean role;
}
