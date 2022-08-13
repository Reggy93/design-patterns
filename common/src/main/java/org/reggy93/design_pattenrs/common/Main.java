package org.reggy93.design_pattenrs.common;


import org.reggy93.design_pattenrs.common.registry.DefaultDesignPatternTypeServiceMapper;
import org.reggy93.design_pattenrs.common.registry.DesignPatternTypeServiceMapper;
import org.reggy93.design_pattenrs.common.service.execution.DefaultDesignPatternExecutionService;
import org.reggy93.design_pattenrs.common.service.execution.DesignPatternExecutionService;
import org.reggy93.design_pattenrs.common.util.DesignPatternType;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOG = Logger.getLogger("MainLogger");

    public static void main(String[] args) {

        final String chosenDesignPattern = args[0];

        LOG.info(() -> String.format("%s [%s]", "Trying to execute logic for passed design pattern:", chosenDesignPattern));

        final DesignPatternTypeServiceMapper designPatternTypeServiceMapper = new DefaultDesignPatternTypeServiceMapper();
        final DesignPatternExecutionService designPatternExecutionService =
                new DefaultDesignPatternExecutionService(designPatternTypeServiceMapper);

        try {
            designPatternExecutionService.executeDesignPatternLogic(DesignPatternType.fromString(chosenDesignPattern));
        } catch (IllegalArgumentException e) {
            LOG.severe("Cannot execute logic because of root case: " + e);
        }
    }


}
