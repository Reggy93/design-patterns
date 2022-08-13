package org.reggy93.design_pattenrs.common.service.design_pattern.observer;

import org.reggy93.design_pattenrs.common.service.design_pattern.DesignPatternService;

import java.util.logging.Logger;

public class ObserverDesignPatternService implements DesignPatternService {

    private static final Logger LOG = Logger.getLogger("ObserverDesignPatternServiceLogger");
    @Override
    public void executeDesignPatternLogic() {

        LOG.info("Executing logic for Observer pattern:");
    }
}
