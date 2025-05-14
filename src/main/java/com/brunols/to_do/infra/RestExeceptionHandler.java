package com.brunols.to_do.infra;

import com.brunols.to_do.exceptions.TaskNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExeceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(TaskNotFoundException.class)
    private ResponseEntity<String> taskNotFound ( TaskNotFoundException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task not found.");
    }

    @ExceptionHandler(Exception.class)
    private ResponseEntity<String> hadleException(Exception ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error.");
    }

}
