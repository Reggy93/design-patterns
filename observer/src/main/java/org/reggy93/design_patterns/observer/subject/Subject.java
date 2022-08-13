package org.reggy93.design_patterns.observer.subject;

import org.reggy93.design_patterns.observer.observer.DisplayObserver;

/**
 * Can register and deregister observers. Calls them when data changed.
 */
public interface Subject {

    /**
     * Register observer - when done such an observer will be notified when data changes.
     *
     * @param displayObserver {@link DisplayObserver} to register
     */
    void registerObserver(DisplayObserver displayObserver);

    /**
     * Deregister observer - when done such an observer won't be notified when data changes.
     *
     * @param displayObserver {@link DisplayObserver} to deregister
     */
    void removerObserver(DisplayObserver displayObserver);

    /**
     * Sets new measurements.
     *
     * @param temperature     temperature of type {@code float}
     * @param humidity        humidity of type {@code float}
     * @param pressure        pressure of type {@code float}
     * @param nextDayForecast next day forecast of type {@link String}
     */
    void setMeasurements(float temperature, float humidity, float pressure, String nextDayForecast);

    /**
     * Retrieves temperature.
     *
     * @return current temperature of type {@code float}
     */
    float getTemperature();

    /**
     * Retrieves current humidity.
     *
     * @return current humidity of type {@code float}
     */
    float getHumidity();

    /**
     * Retrieves current pressure.
     *
     * @return current pressure of type {@code float}
     */
    float getPressure();

    /**
     * Retrieves current next day forecast.
     *
     * @return current next day forecast of type {@link String}
     */
    String getNextDayForecast();


}
