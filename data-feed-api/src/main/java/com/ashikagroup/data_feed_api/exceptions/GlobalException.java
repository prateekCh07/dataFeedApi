package com.ashikagroup.data_feed_api.exceptions;

import com.ashikagroup.data_feed_api.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler {

    ErrorDto errorDto;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDto> globalException(WebRequest request, Exception exception) {
        errorDto = new ErrorDto();
        errorDto.setStatus(HttpStatus.BAD_REQUEST);
        errorDto.setUrl(request.getDescription(false));
        errorDto.setErrorMessage(exception.getMessage());
        errorDto.setErrorTime(LocalDateTime.now());
        return new ResponseEntity<>(errorDto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<ErrorDto> dataNotFoundException(WebRequest request, DataNotFoundException exception){
        errorDto = new ErrorDto();
        errorDto.setStatus(HttpStatus.NOT_FOUND);
        errorDto.setUrl(request.getDescription(false));
        errorDto.setErrorMessage(exception.getMessage());
        errorDto.setErrorTime(LocalDateTime.now());
        return new ResponseEntity<>(errorDto, HttpStatus.NOT_FOUND);
    }
}
