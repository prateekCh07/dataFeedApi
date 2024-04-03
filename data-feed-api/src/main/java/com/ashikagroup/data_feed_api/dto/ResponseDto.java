package com.ashikagroup.data_feed_api.dto;

import org.springframework.http.HttpStatus;

public class ResponseDto {

    private HttpStatus status;
    private String message;

    public ResponseDto(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
