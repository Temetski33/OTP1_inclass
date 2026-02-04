package assignment1;

public class TemperatureConverter {
    public double fahrenheitToCelsius(Double tempF) {
        return (tempF-32)*5/9;
    }

    public double celsiusToFahrenheit(Double tempC) {
        return (tempC*9/5)+32;
    }

    public boolean isExtremeTemperature(Double tempC) {
        return tempC < -40 || tempC > 50;
    }
}
