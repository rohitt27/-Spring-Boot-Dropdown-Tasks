package com.main.task.coder.GlobalExceptionHandler;

import com.main.task.coder.apiResponse.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<?> handleException(Exception ex){
//        ex.printStackTrace();
//
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                .body("An error occured. Please try again later");
//    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleExceptionEx(Exception ex, WebRequest request){
    ExceptionDetails exceptionDetails = new ExceptionDetails(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(exceptionDetails,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(InvalidRequestException.class)
    public ResponseEntity<?> handleInvalidException(InvalidRequestException ex){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
    

}
