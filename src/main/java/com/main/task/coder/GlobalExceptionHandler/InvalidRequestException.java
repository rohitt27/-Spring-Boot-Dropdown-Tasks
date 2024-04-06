package com.main.task.coder.GlobalExceptionHandler;

public class InvalidRequestException extends RuntimeException{
    public InvalidRequestException(String messsage){
        super(messsage);
    }
}
