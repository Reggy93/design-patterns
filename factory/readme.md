# Factory module

Contains example logic for `factory` design pattern.

## Background example story

Imagine there's a franchise store selling sandwiches in different parts of Europe,
let's say in: Poland, Austria and Italy.
There are 3 types of sandwiches sold in all regions:

- Meat
- Cheese
- Veggie

Of course, those sandwiches differ depending on each region (type of cheese, meat and veggie ingredients used
locally for each region).

## Structure

This module consists of two main directories:

- `product`
- `creator`

### Product

Contains all products created by `creator` (`factory`) classes.

### Creator

It Contains classes that create products (in this scenario - sandwiches).
