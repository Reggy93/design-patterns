package org.reggy93.design_patterns.observer.subject;

import org.reggy93.design_patterns.observer.observer.DisplayObserver;

public interface Subject {

    void registerObserver(DisplayObserver displayObserver);

    void removerObserver(DisplayObserver displayObserver);

    void setMeasurements(float temperature, float humidity, float pressure, String nextDayForecast);

    float getTemperature();

    float getHumidity();

    float getPressure();

    String getNextDayForecast();


}
