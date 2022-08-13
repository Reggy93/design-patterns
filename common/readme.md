# COMMON module

This module is an entry point for all other modules. It contains `Main` class in order to execute
program by executing logic of a chosen design-pattern.

## Structure

This module contains mentioned `Main` class and 3 main directories:

- `registry`
- `service`, with `design_pattern` and its subdirectories, as well as the `execution` catalogue
- `util`

### registry

It Contains logic responsible for choosing the right design pattern service implementation based on a passed design
pattern type.

### service

It contains API calls for particular design patterns.

#### design_pattern

This directory reflects already implemented design patterns and contains dedicated logic to call each pattern.

#### execution

Entry point for `Main` class to execute chosen design pattern logic. 