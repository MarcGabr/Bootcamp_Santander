package com.project.bootcampsantander.exceptions;

public class ExceptonResponse {
    private String message;

    ExceptonResponse(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
