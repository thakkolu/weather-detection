package com.example.weather_detection.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class weatherresponse {
    private double lat;
    private double lang;
    private List<Weather> weather;
    private Main main;
    private Wind wind;
    private Sys sys;
    private String name;

}
