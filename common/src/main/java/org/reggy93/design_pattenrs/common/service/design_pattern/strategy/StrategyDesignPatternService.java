package org.reggy93.design_pattenrs.common.service.design_pattern.strategy;

import org.reggy93.design_pattenrs.common.service.design_pattern.DesignPatternService;
import org.reggy93.design_pattenrs.strategy.behaviour.state.PaperStateTicketBehaviour;
import org.reggy93.design_pattenrs.strategy.behaviour.state.TicketStateIdentificationBehaviour;
import org.reggy93.design_pattenrs.strategy.behaviour.state.VirtualStateTicketBehaviour;
import org.reggy93.design_pattenrs.strategy.behaviour.validation.TicketDataOnTicketValidationBehaviour;
import org.reggy93.design_pattenrs.strategy.behaviour.validation.TicketQrCodeValidationBehaviour;
import org.reggy93.design_pattenrs.strategy.behaviour.validation.TicketValidationBehaviour;
import org.reggy93.design_pattenrs.strategy.entity.CinemaTicket;
import org.reggy93.design_pattenrs.strategy.entity.EventTicket;
import org.reggy93.design_pattenrs.strategy.entity.Ticket;
import org.reggy93.design_pattenrs.strategy.entity.TransportTicket;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 * Implementation of {@link DesignPatternService} for {@literal Strategy} design pattern.
 */
public class StrategyDesignPatternService implements DesignPatternService {

    private static final Logger LOG = Logger.getLogger("StrategyDesignPatternServiceLogger");

    @Override
    public void executeDesignPatternLogic() {

        LOG.info("Executing logic for Strategy pattern:");

        final TicketStateIdentificationBehaviour paperTicket = new PaperStateTicketBehaviour();
        final TicketStateIdentificationBehaviour virtualTicket = new VirtualStateTicketBehaviour();

        final TicketValidationBehaviour qrCodeValidation = new TicketQrCodeValidationBehaviour();
        final TicketValidationBehaviour dataOnTicket = new TicketDataOnTicketValidationBehaviour();

        final Ticket cinemaTicket = new CinemaTicket(BigDecimal.TEN, virtualTicket, qrCodeValidation);
        displayTicketInformation(cinemaTicket);

        final Ticket transportTicket = new TransportTicket(BigDecimal.ONE, paperTicket, dataOnTicket);
        displayTicketInformation(transportTicket);

        final Ticket eventTicket = new EventTicket(new BigDecimal(150), paperTicket, qrCodeValidation);
        displayTicketInformation(eventTicket);
    }

    private void displayTicketInformation(final Ticket ticket) {
        ticket.displayTicketTypeShortDescription();
        ticket.displayTicketDescription();
    }
}
