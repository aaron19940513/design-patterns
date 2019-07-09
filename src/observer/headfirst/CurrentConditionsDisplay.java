package observer.headfirst;

import java.util.Observable;
import java.util.Observer;

/**
 * @author sam
 * @date 2019/7/5 15:48
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable weatherData;

    private float temperature;

    private float humidity;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and "
                + humidity + "% humidity");
    }
}
