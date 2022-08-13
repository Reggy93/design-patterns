package org.reggy93.design_pattenrs.common.service.design_pattern.observer;

import org.reggy93.design_pattenrs.common.service.design_pattern.DesignPatternService;
import org.reggy93.design_patterns.observer.observer.CurrentConditionsDisplay;
import org.reggy93.design_patterns.observer.observer.DisplayObserver;
import org.reggy93.design_patterns.observer.observer.NextDayForecastDisplay;
import org.reggy93.design_patterns.observer.subject.Subject;
import org.reggy93.design_patterns.observer.subject.WeatherData;

import java.util.logging.Logger;

/**
 * Implementation of {@link DesignPatternService} for {@literal Strategy} design pattern.
 */
public class ObserverDesignPatternService implements DesignPatternService {

    private static final Logger LOG = Logger.getLogger("ObserverDesignPatternServiceLogger");

    @Override
    public void executeDesignPatternLogic() {

        LOG.info("Executing logic for Observer pattern:");
        final Subject weatherStation = new WeatherData();

        final DisplayObserver currentConditionsDisplay = new CurrentConditionsDisplay(weatherStation);
        final DisplayObserver nextDayForecastDisplay = new NextDayForecastDisplay(weatherStation);

        LOG.info("Registering currentConditionsDisplay and nextDayForecastDisplay observers");
        weatherStation.registerObserver(currentConditionsDisplay);
        weatherStation.registerObserver(nextDayForecastDisplay);

        weatherStation.setMeasurements(28.7f, 60.9f, 985, "Next day will be sunny");
        weatherStation.setMeasurements(23.6f, 89.8f, 1050, "Next day will be rainy");

        LOG.info("Unregistering the nextDayForecastDisplay observer");
        weatherStation.removerObserver(nextDayForecastDisplay);

        weatherStation.setMeasurements(22.1f, 71.5f, 1045, "I don't care - this won't be displayed anyway");
    }
}
