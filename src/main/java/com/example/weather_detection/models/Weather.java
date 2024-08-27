package com.example.weather_detection.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weather {
    long id;
    String main;
    String description;
    String temp;
}
