package ch2_observer;

import ch2_observer.classes.CurrentConditionsDisplay;
import ch2_observer.classes.HeatIndexDisplay;
import ch2_observer.classes.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class WeatherStation {

    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
