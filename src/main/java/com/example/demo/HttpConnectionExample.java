package com.example.demo;

import java.io.BufferedReader;    
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnectionExample {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static String GET_URL = "http://api.weatherapi.com/v1/current.json?key=83ec500b1d684130b61144058252207&q=reemplazar&aqi=no";
    private static String anterior = "reemplazar";
        public static String conseguirClimapara(String city) throws IOException {
        
            for(String part : GET_URL.split("&")) {
                if(part.contains(anterior)) {
                GET_URL = GET_URL.replace(anterior, city);
            }
        }
        anterior = city; 
        System.out.println("City: " + city);
        System.out.println("GET URL: " + GET_URL);
        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        
        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            return response.toString();
        } else {
            return "GET request not worked";
        }
    }

}