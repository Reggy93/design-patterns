package org.reggy93.design_pattenrs.strategy.entity;

import org.reggy93.design_pattenrs.strategy.behaviour.state.TicketStateIdentificationBehaviour;
import org.reggy93.design_pattenrs.strategy.behaviour.validation.TicketValidationBehaviour;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 * Represent a transport ticket.
 */
public class TransportTicket extends Ticket {

  private static final Logger LOG = Logger.getLogger("TransportTicketLogger");

  public TransportTicket(
      BigDecimal price,
      TicketStateIdentificationBehaviour ticketStateIdentificationBehaviour,
      TicketValidationBehaviour ticketValidationBehaviour) {
    super(price, ticketStateIdentificationBehaviour, ticketValidationBehaviour);
  }

  @Override
  public void displayTicketTypeShortDescription() {
    LOG.info("This is transport ticket!");
  }
}
