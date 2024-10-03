package com.yeter.testapp.dto.Request.Filter;

import lombok.Data;

@Data
public class VariantFilterRequest {
    private int id;
    private int questionId;
    private String variant;
    }
