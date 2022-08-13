# OBSERVER module
Contains example logic for `observer` design pattern.

## Background example story

Let's say there is an application that provides you with the weather parameters
like temperature, humidity, pressure and next day weather forecast.
The data come from the weather station and can be displayed on several displays which
include at the beginning:

- raw data: `tempreture`, `humidity`, `pressure`
- forecast for the next day

All of the above will be displayed on a dedicated display.
The point here is that later on the number of displays can be extended and new
data can be displayed.

## Structure

This module contains two main directories:

- `observer`
- `subject`

### observer

This directory contains `observer` objects - in this particular scenario that would be displays.
Each display has a reference to the weather station (`subject`) in order to allow retrieving only interesting
information.

### subject

It contains an object equivalent to the weather station. Allows setting new data for measurements — when it's done,
`subject` calls all the registered observers to let them know that they should retrieve interesting for them data.