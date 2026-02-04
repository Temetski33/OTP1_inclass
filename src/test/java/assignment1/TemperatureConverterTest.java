package assignment1;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
    }

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {

    }

    @org.junit.jupiter.api.Test
    void isExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature((double) -60));
    }
}