package com.yeter.testapp.dto.Response;

import lombok.Data;

@Data
public class RegisteredResponse {
    private int id;
    private String username;
    private int password;
    private boolean role;
}
