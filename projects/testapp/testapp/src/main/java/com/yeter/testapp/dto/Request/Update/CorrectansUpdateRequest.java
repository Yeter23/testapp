package com.yeter.testapp.dto.Request.Update;

import lombok.Data;

@Data
public class CorrectansUpdateRequest {
    private int id;
    private int questionId;
    private int variantId;
}
