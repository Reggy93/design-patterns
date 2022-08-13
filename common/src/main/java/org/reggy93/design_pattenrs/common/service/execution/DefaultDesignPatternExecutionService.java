package org.reggy93.design_pattenrs.common.service.execution;

import org.reggy93.design_pattenrs.common.registry.DesignPatternTypeServiceMapper;
import org.reggy93.design_pattenrs.common.service.design_pattern.DesignPatternService;
import org.reggy93.design_pattenrs.common.util.DesignPatternType;

/**
 * Default implementation of {@link DesignPatternExecutionService}.
 */
public class DefaultDesignPatternExecutionService implements DesignPatternExecutionService {

    private final DesignPatternTypeServiceMapper designPatternTypeServiceMapper;

    public DefaultDesignPatternExecutionService(DesignPatternTypeServiceMapper designPatternTypeServiceMapper) {
        this.designPatternTypeServiceMapper = designPatternTypeServiceMapper;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void executeDesignPatternLogic(DesignPatternType designPatternType) {
        designPatternTypeServiceMapper.retrieveMappedDesignPattern(designPatternType)
                .ifPresentOrElse(DesignPatternService::executeDesignPatternLogic,
                        () -> {
                            throw new IllegalArgumentException(String.format("%s [%s] %s", "Couldn't execute design " +
                                    "pattern logic as passed tpe:", designPatternType, "couldn't be mapped!"));
                        });
    }
}
