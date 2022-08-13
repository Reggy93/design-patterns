package org.reggy93.design_patterns.observer.observer;

import org.reggy93.design_patterns.observer.subject.Subject;

import java.util.logging.Logger;

public class CurrentConditionsDisplay implements DisplayObserver {

    private static final Logger LOG = Logger.getLogger("CurrentConditionsDisplayLogger");

    private final Subject subject;

    private float temperature;

    private float humidity;

    private float pressure;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        this.temperature = subject.getTemperature();
        this.humidity = subject.getHumidity();
        this.pressure = subject.getPressure();

        display();
    }


    private void display() {
        LOG.info(() -> String.format("%s [%s] %s [%s], %s [%s]", "Current temperature:", temperature,
                "current humidity:", humidity, "current pressure:", pressure));
    }
}
