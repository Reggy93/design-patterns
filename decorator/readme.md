# DECORATOR module

Contains example logic for `decorator` design pattern.

## Example background story

Imagine you have a shop that sells skateboards.
There are different types of skateboards.
For this example, let's assume there are 4 types:
 - Downhill
 - Longboard
 - Street
 - Freestyle

This is the very basics — each board consists of... board of a particular type and 4 wheels.
Clients are demanding, and they almost always want to have a personalized board, so they are allowed to configure 
(decorate) them via configurator and to choose, for example:
 - graphics on the bottom
 - labels on the top
 - graphics for wheels

All above decorations can be used as multiple.
Each skateboard type has its own price, as well as every particular decoration also has its price.
The task is to create a configurator application that will sum up the total cost of configured skateboard.

## Structure

There are directories like:
- `entity` - contains all the entities — skateboard types
- `configurator` - contains all enhancers (decorators)