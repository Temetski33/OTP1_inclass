package assignment1;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32.0), 0.0001);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212.0), 0.0001);
        assertEquals(-40.0, TemperatureConverter.fahrenheitToCelsius(-40.0), 0.0001);
        assertEquals(37.0, TemperatureConverter.fahrenheitToCelsius(98.6), 0.0001);
    }

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0.0), 0.0001);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100.0), 0.0001);
        assertEquals(14.0, TemperatureConverter.celsiusToFahrenheit(-10.0), 0.0001);
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37.0), 0.0001);

    }

    @org.junit.jupiter.api.Test
    void isExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-60.0));
        assertTrue(TemperatureConverter.isExtremeTemperature(-50.01));
        assertTrue(TemperatureConverter.isExtremeTemperature(300.0));

        assertFalse(TemperatureConverter.isExtremeTemperature(20.0));
        assertFalse(TemperatureConverter.isExtremeTemperature(15.0432));

        // Boundary values
        assertFalse(TemperatureConverter.isExtremeTemperature(-40.0));
        assertFalse(TemperatureConverter.isExtremeTemperature(50.0));
    }

    // Kelvin test
    @org.junit.jupiter.api.Test
    void kelvinToCelsius() {
        assertEquals(26.85, TemperatureConverter.kelvinToCelsius(300.0), 0.0001);
        assertEquals(0.0, TemperatureConverter.kelvinToCelsius(273.15), 0.0001);
        assertEquals(-273.15, TemperatureConverter.kelvinToCelsius(0.0), 0.0001);
        assertEquals(100.0, TemperatureConverter.kelvinToCelsius(373.15), 0.0001);
    }
}