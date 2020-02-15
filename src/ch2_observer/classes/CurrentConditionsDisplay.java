package ch2_observer.classes;

import ch2_observer.interfaces.DisplayElement;
import ch2_observer.interfaces.Observer;
import ch2_observer.interfaces.Subject;

public class CurrentConditionsDisplay  implements DisplayElement, Observer {

    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temp
                + "F degrees and "+humidity + "%humidity");
    }
}
