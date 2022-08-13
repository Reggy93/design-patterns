package org.reggy93.design_pattenrs.strategy.entity;

import org.reggy93.design_pattenrs.strategy.behaviour.state.TicketStateIdentificationBehaviour;
import org.reggy93.design_pattenrs.strategy.behaviour.validation.TicketValidationBehaviour;

import java.math.BigDecimal;
import java.util.logging.Logger;

/**
 * Represent some event ticket.
 */
public class EventTicket extends Ticket {

  private static final Logger LOG = Logger.getLogger("EventTicketLogger");

  public EventTicket(
      BigDecimal price,
      TicketStateIdentificationBehaviour ticketStateIdentificationBehaviour,
      TicketValidationBehaviour ticketValidationBehaviour) {
    super(price, ticketStateIdentificationBehaviour, ticketValidationBehaviour);
  }

  @Override
  public void displayTicketTypeShortDescription() {
    LOG.info("This is event ticket!");
  }
}
