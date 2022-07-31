package org.reggy93.design_patterns.strategy.entity;

import org.reggy93.design_patterns.strategy.behaviour.state.TicketStateIdentificationBehaviour;
import org.reggy93.design_patterns.strategy.behaviour.validation.TicketValidationBehaviour;

import java.math.BigDecimal;
import java.util.logging.Logger;

import static org.reggy93.design_patterns.strategy.util.MessageLoggerUtil.logMessage;

public abstract class Ticket {

  private static final Logger LOG = Logger.getLogger("TicketLogger");
  private final BigDecimal price;

  private final TicketStateIdentificationBehaviour ticketStateIdentificationBehaviour;

  private final TicketValidationBehaviour ticketValidationBehaviour;

  protected Ticket(
      BigDecimal price,
      TicketStateIdentificationBehaviour ticketStateIdentificationBehaviour,
      TicketValidationBehaviour ticketValidationBehaviour) {

    this.price = price;
    this.ticketStateIdentificationBehaviour = ticketStateIdentificationBehaviour;
    this.ticketValidationBehaviour = ticketValidationBehaviour;
  }

  public void displayTicketDescription() {
    LOG.info(
        logMessage(
            "Ticket with description:",
            ticketStateIdentificationBehaviour.retrieveTicketStateInformation(),
            ticketValidationBehaviour.retrieveTicketValidationType(),
            "price: " + price));
  }

  public BigDecimal getPrice() {
    return price;
  }

  public abstract void displayTicketTypeShortDescription();
}
