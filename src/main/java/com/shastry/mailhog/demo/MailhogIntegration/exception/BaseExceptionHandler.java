package com.shastry.mailhog.demo.MailhogIntegration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class BaseExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, List<Error>> badRequestExceptionHandler(final MethodArgumentNotValidException exception) {

        var errors = new HashMap<String, List<Error>>();
        var errorList = exception.getBindingResult().getAllErrors().stream().map(error -> {

            String fieldName = ((FieldError) error).getField();
            String message = error.getDefaultMessage();
            return Error.builder().fieldName(fieldName).errorMessage(message).build();
        }).collect(Collectors.toList());

        errors.put("errors", errorList);

        return errors;
    }
}
