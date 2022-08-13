package org.reggy93.design_patterns.observer.observer;

import org.reggy93.design_patterns.observer.subject.Subject;

import java.util.logging.Logger;

public class NextDayForecastDisplay implements DisplayObserver {

    private static final Logger LOG = Logger.getLogger("NextDayForecastDisplayLogger");

    private final Subject subject;

    private String nextDayForecast;

    public NextDayForecastDisplay(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        this.nextDayForecast = subject.getNextDayForecast();

        display();
    }

    private void display() {
        LOG.info(() -> String.format("%s [%s]", "Forecast for next day is", this.nextDayForecast));
    }
}
