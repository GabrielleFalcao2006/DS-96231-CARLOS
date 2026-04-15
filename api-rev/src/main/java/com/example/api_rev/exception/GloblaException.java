package com.example.api_rev.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GloblaException {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String,String>> runtimeException(RuntimeException exception){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("ERRO: ",exception.getMessage()));
    }
}
