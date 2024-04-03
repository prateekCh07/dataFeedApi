package com.ashikagroup.data_feed_api.dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ErrorDto {

    private HttpStatus status;
    private String url;
    private String errorMessage;
    private LocalDateTime errorTime;

    public ErrorDto(){}

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public LocalDateTime getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(LocalDateTime errorTime) {
        this.errorTime = errorTime;
    }
}
