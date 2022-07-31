package org.reggy93.design_patterns.strategy;

import org.reggy93.design_patterns.strategy.behaviour.state.PaperStateTicketBehaviour;
import org.reggy93.design_patterns.strategy.behaviour.state.TicketStateIdentificationBehaviour;
import org.reggy93.design_patterns.strategy.behaviour.state.VirtualStateTicketBehaviour;
import org.reggy93.design_patterns.strategy.behaviour.validation.TicketDataOnTicketValidationBehaviour;
import org.reggy93.design_patterns.strategy.behaviour.validation.TicketQrCodeValidationBehaviour;
import org.reggy93.design_patterns.strategy.behaviour.validation.TicketValidationBehaviour;
import org.reggy93.design_patterns.strategy.entity.CinemaTicket;
import org.reggy93.design_patterns.strategy.entity.EventTicket;
import org.reggy93.design_patterns.strategy.entity.Ticket;
import org.reggy93.design_patterns.strategy.entity.TransportTicket;

import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {

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

  private static void displayTicketInformation(final Ticket ticket) {
    ticket.displayTicketTypeShortDescription();
    ticket.displayTicketDescription();
  }
}
