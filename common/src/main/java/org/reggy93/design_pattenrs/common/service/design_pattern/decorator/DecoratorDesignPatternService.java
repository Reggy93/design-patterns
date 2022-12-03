package org.reggy93.design_pattenrs.common.service.design_pattern.decorator;

import org.reggy93.design_pattenrs.common.service.design_pattern.DesignPatternService;
import org.reggy93.design_patterns.decorator.configurator.BottomGraphicsSkateBoardEnhancer;
import org.reggy93.design_patterns.decorator.configurator.TopLabelSkateboardEnhancer;
import org.reggy93.design_patterns.decorator.configurator.WheelsGraphicsSkateboardEnhancer;
import org.reggy93.design_patterns.decorator.entity.*;

import java.util.logging.Logger;

/**
 * Implementation of {@link DesignPatternService} for {@literal Decorator} design pattern.
 */
public class DecoratorDesignPatternService implements DesignPatternService {

    private static final Logger LOG = Logger.getLogger("DecoratorDesignPatternServiceLogger");
    @Override
    public void executeDesignPatternLogic() {
        LOG.info("Executing logic for Decorator pattern:");

        final Skateboard longboard = new Longboard();
        logDescriptionWithTotalPrice(longboard);

        final Skateboard longboardWithBottomGraphics = new BottomGraphicsSkateBoardEnhancer(longboard);
        logDescriptionWithTotalPrice(longboardWithBottomGraphics);

        final Skateboard longboardWithBottomGraphicsAndTopLabel =
                new TopLabelSkateboardEnhancer(longboardWithBottomGraphics);
        logDescriptionWithTotalPrice(longboardWithBottomGraphicsAndTopLabel);

        final Skateboard longBoardWithTwoBottomGraphicsAndTopLabel =
                new BottomGraphicsSkateBoardEnhancer(longboardWithBottomGraphicsAndTopLabel);
        logDescriptionWithTotalPrice(longBoardWithTwoBottomGraphicsAndTopLabel);

        final Skateboard longboardWithTwoBottomGraphicsTopLabelAndWheelGraphics =
                new WheelsGraphicsSkateboardEnhancer(longBoardWithTwoBottomGraphicsAndTopLabel);
        logDescriptionWithTotalPrice(longboardWithTwoBottomGraphicsTopLabelAndWheelGraphics);

        LOG.info("##################################################################");

        final Skateboard freestyle = new Freestyle();
        logDescriptionWithTotalPrice(new WheelsGraphicsSkateboardEnhancer(freestyle));

        LOG.info("###################################################################");

        final Skateboard street = new Street();
        logDescriptionWithTotalPrice(street);

        final Skateboard streetWithTopLabel = new TopLabelSkateboardEnhancer(street);
        logDescriptionWithTotalPrice(streetWithTopLabel);

        logDescriptionWithTotalPrice(new BottomGraphicsSkateBoardEnhancer(streetWithTopLabel));

        LOG.info("####################################################################");

        final Skateboard downhill = new Downhill();
        logDescriptionWithTotalPrice(downhill);

        final Skateboard downhillWithTopLabel = new TopLabelSkateboardEnhancer(downhill);
        logDescriptionWithTotalPrice(downhillWithTopLabel);

    }

    private void logDescriptionWithTotalPrice(final Skateboard skateboard) {
        LOG.info(() -> String.format("%s: [%s], %n %s: [%s]", "Skateboard description", skateboard.getDescription(),
                "skateboard total price", skateboard.getPrice()));
    }
}
