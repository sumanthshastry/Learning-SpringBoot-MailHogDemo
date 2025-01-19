package com.shastry.mailhog.demo.MailhogIntegration.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {

    @NotEmpty
    @Size(min=2, max=30, message = "FirstName must have min 2 chars, max 30 chars")
    private String firstName;

    @NotEmpty
    @Size(min=2, max=30, message = "FirstName must have min 2 chars, max 30 chars")
    private String lastName;

    @NotEmpty
    @Email(message = "Invalid Email format")
    private String email;
}
