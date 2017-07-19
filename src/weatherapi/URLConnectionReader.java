package weatherapi;

import java.net.*;

import com.google.gson.Gson;

import java.io.*;

public class URLConnectionReader {
    public static void main(String[] args) throws Exception {
        URL weather = new URL("http://api.openweathermap.org/data/2.5/weather?q=GrandIsland&appid=aa9cfa9c60b99d03c201f4ae931d0b4c&units=metric");
        URL forecast = new URL("http://api.openweathermap.org/data/2.5/forecast?q=Lincoln&appid=aa9cfa9c60b99d03c201f4ae931d0b4c&units=metric&cnt=10");

        URLConnection wc = weather.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                wc.getInputStream()));
        String inputLine;

        if ((inputLine = in.readLine()) != null)  {
        	Gson gson = new Gson();
            System.out.println(inputLine);
        	WeatherResponse wr = gson.fromJson(inputLine, WeatherResponse.class);
            System.out.println(wr);

    }
        else
        	System.out.println("No Response Recieved");
        in.close();

        URLConnection fc = forecast.openConnection();
        in = new BufferedReader(
                                new InputStreamReader(
                                fc.getInputStream()));
        
        if ((inputLine = in.readLine()) != null)  {
        	Gson gson = new Gson();
// /           System.out.println(inputLine);
        	ForecastResponse fr = gson.fromJson(inputLine, ForecastResponse.class);
            System.out.println(fr);

    }
        else
        	System.out.println("No Response Recieved");
        in.close();
        
    }
}