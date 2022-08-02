package org.reggy93.design_pattenrs.strategy.entity;

import org.reggy93.design_pattenrs.strategy.behaviour.state.TicketStateIdentificationBehaviour;
import org.reggy93.design_pattenrs.strategy.behaviour.validation.TicketValidationBehaviour;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class CinemaTicket extends Ticket {

  private static final Logger LOG = Logger.getLogger("CinemaTicketLogger");

  public CinemaTicket(
      BigDecimal price,
      TicketStateIdentificationBehaviour ticketStateIdentificationBehaviour,
      TicketValidationBehaviour ticketValidationBehaviour) {
    super(price, ticketStateIdentificationBehaviour, ticketValidationBehaviour);
  }

  @Override
  public void displayTicketTypeShortDescription() {
    LOG.info("This is cinema ticket!");
  }
}
