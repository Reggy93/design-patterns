package org.reggy93.design_pattenrs.common;


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
