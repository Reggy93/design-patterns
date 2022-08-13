# The Observer pattern

## Background example story

Let's say there is an application that provides you with the weather parameters
like temperature, humidity and pressure.
The data come from the weather station and can be displayed on several displays which
include at the beginning:

- raw data: `tempreture`, `humidity`, 
- `pressure`
- forecast for the next day

All of the above will be displayed on a dedicated display.
The point here is that later on the number of displays can be extended and new
data can be displayed.
