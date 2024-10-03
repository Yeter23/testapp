package com.yeter.testapp.dto.Request.Create;

import lombok.Data;

@Data
public class RegisteredCreateRequest {
    private String username;
    private int password;
    private boolean role;
}
