package org.reggy93.design_patterns.strategy.entity;

import org.reggy93.design_patterns.strategy.behaviour.state.TicketStateIdentificationBehaviour;
import org.reggy93.design_patterns.strategy.behaviour.validation.TicketValidationBehaviour;

import java.math.BigDecimal;
import java.util.logging.Logger;

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
