package com.example.weather_detection.adviser;

import com.example.weather_detection.exceptions.weathernotfoundexception;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class controlleradvise {
    @ExceptionHandler(weathernotfoundexception.class)
    public ResponseEntity<String> weathernotfound( weathernotfoundexception e){
        return new ResponseEntity<>(e.getMessage(), HttpStatusCode.valueOf(400));
    }
}
