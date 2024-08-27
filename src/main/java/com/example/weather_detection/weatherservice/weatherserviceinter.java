package com.example.weather_detection.weatherservice;

import com.example.weather_detection.exceptions.weathernotfoundexception;
import com.example.weather_detection.models.Weather;
import com.example.weather_detection.models.weatherresponse;
import org.springframework.stereotype.Service;


public interface weatherserviceinter {
    public weatherresponse getcurrentweather(double lat, double lang)throws weathernotfoundexception;

}
