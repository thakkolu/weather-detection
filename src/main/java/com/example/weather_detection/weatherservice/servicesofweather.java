package com.example.weather_detection.weatherservice;

import com.example.weather_detection.dtoweather.weatherdto;
import com.example.weather_detection.exceptions.weathernotfoundexception;
import com.example.weather_detection.models.Weather;
import com.example.weather_detection.models.weatherresponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class servicesofweather implements weatherserviceinter{
    private static final String apikey="dd242d1699977f662e13ca5fc2c8e1e5";

    @Override
    public weatherresponse getcurrentweather(double lat, double lang) throws weathernotfoundexception {
       String url="https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lang+"&appid="+apikey;
        // https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}
        RestTemplate restTemplate=new RestTemplate();

        weatherresponse dto=restTemplate.getForObject(url, weatherresponse.class);
        if(dto==null){
            throw new weathernotfoundexception("weather with lattitude " +lat+" ans langitude "+lang +" is not found");
        }
        dto.setLat(lat);
        dto.setLang(lang);

        return dto;
    }
    /*private Weather convertweatherdtotoweather(weatherdto dto){
        Weather weath=new Weather();
        weath.setId(dto.getId());
        weath.setMain(dto.getMain());
        weath.setDescription(dto.getDescription());
        weath.setTemp(dto.getIcon());
        return weath;
   }*/
}
