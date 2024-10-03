package com.yeter.testapp.dto.Request.Update;

import lombok.Data;

@Data
public class RegisteredUpdateRequest {
    private int id;
    private String username;
    private int password;
    private boolean role;
}
