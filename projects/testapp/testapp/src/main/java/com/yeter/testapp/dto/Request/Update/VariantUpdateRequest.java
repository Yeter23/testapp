package com.yeter.testapp.dto.Request.Update;

import lombok.Data;

@Data
public class VariantUpdateRequest {
    private int id;
    private int questionId;
    private String variant;
}
