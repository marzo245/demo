package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private Service service;


    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/clima")
    public String getWeather(@RequestParam String city) throws IOException {
        return service.conseguirClima(city);
    }

    @GetMapping("/clima/latlong")
    public String getWeatherByLatLong(@RequestParam String city) throws IOException {
        String parts = service.conseguirClima(city);
        String lat = "";
        String longi = "";
        for(String part : parts.split(",")) {
            if(part.contains("lat")) {
                lat = part.split(":")[1].replace("\"", "").trim();
                longi = parts.split(",")[1].split(":")[1].replace("\"", "").trim();
            }
        }
        System.out.println("Latitud: " + lat);
        return "{ lat: "+lat+", lng: "+longi+" }";
    }
}
