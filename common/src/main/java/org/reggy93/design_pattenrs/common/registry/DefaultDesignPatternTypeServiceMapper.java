package org.reggy93.design_pattenrs.common.registry;

import org.reggy93.design_pattenrs.common.service.design_pattern.DesignPatternService;
import org.reggy93.design_pattenrs.common.service.design_pattern.decorator.DecoratorDesignPatternService;
import org.reggy93.design_pattenrs.common.service.design_pattern.observer.ObserverDesignPatternService;
import org.reggy93.design_pattenrs.common.service.design_pattern.strategy.StrategyDesignPatternService;
import org.reggy93.design_pattenrs.common.util.DesignPatternType;

import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

import static org.reggy93.design_pattenrs.common.util.DesignPatternType.*;

/**
 * Default implementation of {@link DesignPatternTypeServiceMapper}.
 */
public class DefaultDesignPatternTypeServiceMapper implements DesignPatternTypeServiceMapper {

    private static final Map<DesignPatternType, DesignPatternService> DESIGN_PATTERN_SERVICE_MAP;

    static {
        DESIGN_PATTERN_SERVICE_MAP = new EnumMap<>(DesignPatternType.class);
        DESIGN_PATTERN_SERVICE_MAP.put(OBSERVER, new ObserverDesignPatternService());
        DESIGN_PATTERN_SERVICE_MAP.put(STRATEGY, new StrategyDesignPatternService());
        DESIGN_PATTERN_SERVICE_MAP.put(DECORATOR, new DecoratorDesignPatternService());
    }

    @Override
    public Optional<DesignPatternService> retrieveMappedDesignPattern(DesignPatternType designPatternType) {
        return Optional.ofNullable(DESIGN_PATTERN_SERVICE_MAP.get(designPatternType));
    }
}
