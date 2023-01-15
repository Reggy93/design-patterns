package org.reggy93.design_pattenrs.common.service.design_pattern.factory;

import com.reggy93.design_pattenrs.factory.creator.AustrianStyleSandwichFactory;
import com.reggy93.design_pattenrs.factory.creator.ItalianStyleSandwichFactory;
import com.reggy93.design_pattenrs.factory.creator.PolishStyleSandwichFactory;
import com.reggy93.design_pattenrs.factory.creator.SandwichFactory;
import com.reggy93.design_pattenrs.factory.product.Sandwich;
import com.reggy93.design_pattenrs.factory.product.SandwichType;
import org.reggy93.design_pattenrs.common.service.design_pattern.DesignPatternService;

import java.util.logging.Logger;

import static com.reggy93.design_pattenrs.factory.product.SandwichType.*;
import static org.reggy93.design_pattenrs.common.service.design_pattern.factory.FactoryDesignPatternService.Country.*;

public class FactoryDesignPatternService implements DesignPatternService {

    private static final Logger LOG = Logger.getLogger("FactoryDesignPatternServiceLogger");

    final SandwichFactory austrianSandwichFactory = new AustrianStyleSandwichFactory();
    final SandwichFactory italianSandwichFactory = new ItalianStyleSandwichFactory();
    final SandwichFactory polishSandwichFactory = new PolishStyleSandwichFactory();

    @Override
    public void executeDesignPatternLogic() {

        LOG.info("Executing logic for Factory pattern:");

        LOG.info("################### Cheese sandwiches #####################################");

        orderSandwich(AUSTRIAN, CHEESE);
        orderSandwich(ITALIAN, CHEESE);
        orderSandwich(POLISH, CHEESE);

        LOG.info("#####################################################################");
        LOG.info("################### Meat sandwiches #####################################");

        orderSandwich(AUSTRIAN, MEAT);
        orderSandwich(ITALIAN, MEAT);
        orderSandwich(POLISH, MEAT);

        LOG.info("#####################################################################");
        LOG.info("################### Veggie sandwiches #####################################");

        orderSandwich(AUSTRIAN, VEGGIE);
        orderSandwich(ITALIAN, VEGGIE);
        orderSandwich(POLISH, VEGGIE);
    }

    private void orderSandwich(final Country country, final SandwichType sandwichType) {
        logBeforeOrdering(country, sandwichType);
        Sandwich sandwich = null;
        switch (country) {
            case AUSTRIAN -> sandwich = austrianSandwichFactory.orderSandwich(sandwichType);
            case ITALIAN -> sandwich = italianSandwichFactory.orderSandwich(sandwichType);
            case POLISH -> sandwich = polishSandwichFactory.orderSandwich(sandwichType);
        }
        logAfterOrdering(country, sandwichType, sandwich);
    }

    private void logBeforeOrdering(final Country country, final SandwichType sandwichType) {
        LOG.info(() -> String.format("Ordering [%s] [%s] sandwich", country, sandwichType));
    }

    private void logAfterOrdering(final Country country, final SandwichType sandwichType,
                                  final Sandwich orderedSandwich) {
        LOG.info(() -> String.format("Ordered [%s] [%s] sandwich %s", country, sandwichType, orderedSandwich));
    }

    enum Country {
        AUSTRIAN, ITALIAN, POLISH
    }
}
