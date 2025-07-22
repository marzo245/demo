package com.example.demo;

import java.io.IOException;

import org.json.JSONObject;

@org.springframework.stereotype.Service
public class Service {
    
    public String conseguirClima(String city) throws IOException {
        return HttpConnectionExample.conseguirClimapara(city);
        
    }

}
