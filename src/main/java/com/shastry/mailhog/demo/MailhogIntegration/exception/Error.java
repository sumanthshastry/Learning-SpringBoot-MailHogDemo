package com.shastry.mailhog.demo.MailhogIntegration.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Error {
    private String fieldName;
    private String errorMessage;
}
