package observer.headfirst;

import java.util.Observable;

/**
 * @author sam
 * @date 2019/7/5 15:51
 */
public class WeatherData extends Observable {
    private float temperature;

    private float humidity;

    private float pressure;

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature =temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
