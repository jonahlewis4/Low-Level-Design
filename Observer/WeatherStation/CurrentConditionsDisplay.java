import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer{
    Observable observable;
    private float humidity;
    private float temperature;

    public CurrentConditionsDisplay(Observable o) {
        this.observable = o;
        o.addObserver(this);
    }

    public void update(Observable obs, Object args) {
        if (obs instanceof WeatherData weatherData){
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }

    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " +
                humidity + "% humidity");
    }

}
