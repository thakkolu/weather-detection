package com.example.weather_detection.weathercontoller;

import com.example.weather_detection.exceptions.weathernotfoundexception;
import com.example.weather_detection.models.Weather;
import com.example.weather_detection.models.weatherresponse;
import com.example.weather_detection.weatherservice.servicesofweather;
import com.example.weather_detection.weatherservice.weatherserviceinter;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerofweather {
    //@Autowired
    private weatherserviceinter weatherserviceinters=new servicesofweather();
    @GetMapping("Weather/now/{lat}/{lang}")
    public ResponseEntity<weatherresponse> getcurrentweather(@PathVariable("lat")double lat, @PathVariable("lang")double lang) throws weathernotfoundexception {
        weatherresponse wea=weatherserviceinters.getcurrentweather(lat,lang);
        return new ResponseEntity<>(wea,HttpStatusCode.valueOf(200));
    }


}
