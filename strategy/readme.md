# STRATEGY module

Contains example logic for `strategy` design pattern.

## Example background story

There are different types of tickets — they can be differentiated, for example, by type (paper, virtual/electronic)
or validation form (by scanning QR code or reading the data on the ticket itself).
Strategy pattern helps to disjoint dynamic behaviour from particular objects itself.

## Structure

There are directories like:

- `behaviour` - groups different type of strategies
    - `state` - for ticket state
    - `validation` - for ticket validation
- `entity` - tickets and its behaviour types
- `util` - irrelevant for this design pattern concept - contains logic that helps with logging

### state
It contains logic that defines state behaviour for paper and virtual/electronic tickets.

### validation
It contains logic that defines validation behaviour for tickets — QR code scanning or validating on ticket data.

### entity
Contains abstract `Ticket` template class and concrete tickets classes for particular destiny.
This directory also contains defined behaviour types.


