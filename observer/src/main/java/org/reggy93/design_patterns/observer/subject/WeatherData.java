package org.reggy93.design_patterns.observer.subject;

import org.reggy93.design_patterns.observer.observer.DisplayObserver;

import java.util.*;

/**
 * Default implementation of {@link Subject}.
 */
public class WeatherData implements Subject {

    private final List<DisplayObserver> displaysRegistry;

    private float temperature;

    private float humidity;

    private float pressure;

    private String nextDayForecast;

    public WeatherData() {
        this.displaysRegistry = new ArrayList<>();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void registerObserver(final DisplayObserver displayObserver) {
        Optional.ofNullable(displayObserver).ifPresent(displayToRegister ->
                displaysRegistry.add(displayObserver));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removerObserver(final DisplayObserver displayObserver) {
        Optional.ofNullable(displayObserver).ifPresent(displayToDeregister ->
                displaysRegistry.remove(displayObserver));

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setMeasurements(float temperature, float humidity, float pressure, final String nextDayForecast) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.nextDayForecast = nextDayForecast;

        notifyObservers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getTemperature() {
        return this.temperature;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getHumidity() {
        return this.humidity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getPressure() {
        return this.pressure;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getNextDayForecast() {
        return this.nextDayForecast;
    }

    private void notifyObservers() {
        displaysRegistry.forEach(DisplayObserver::update);
    }
}
