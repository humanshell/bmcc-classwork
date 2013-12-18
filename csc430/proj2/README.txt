# Overview

This project uses global variables and functions defined in a single
file to setup the test arrays and then analyzes them using the sorting
functions from class. The main() function is defined at the very bottom
of the file and only exists to call the setup functions and sorting
execution functions. Each sorting execution function is responsible for
running the individual sorting functions on each test array.

# Global Variables

In an effort to keep things simple, I've defined all the test arrays as
global variables so they're available to the entire program rather than
passing them around to the functions that need to operate on them.

# Functions

## generate_arrays()

This function runs three loops to initialize all of the test arrays with
their starting values.

## shuffle_arrays()

This function uses the Fisher–Yates shuffle (also known as the Knuth
shuffle) to rearrange the test arrays to conform to the specifications
outlined in the project worksheet. Each replacement during the shuffle
uses the exclusive-or (XOR) method of swapping in place.

Shuffling Algorithm:
http://en.wikipedia.org/wiki/Fisher–Yates_shuffle

## Sorting execution functions

Each of the individual sorting functions are executed by a single
function in main(). The execution function in main() is responsible for
running each of the arrays through the appropriate sorting function.

# Analysis

Unfortunately I did not have the time to generate any graphical
analysis. Instead I opted for a time based analysis. Each of the sorting
execution functions keeps track of the time it takes to run each of the
sorts on each of the arrays and then outputs that information to the
terminal so you can see which sort out-performs, or under-performs, the
others across all of the test arrays.


