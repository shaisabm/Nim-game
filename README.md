# Nim Game

This is a simple implementation of the Nim game in Java. Nim is a mathematical game of strategy where players take turns removing objects from distinct heaps or rows. The player who removes the last object loses.
## How to Run

1. **Compile the Java File:**
   Extract the zip file. open a terminal and navigate to the directory containing the Java file (`Nim.java`). Use the following command to compile the file:

   ```bash
   javac Nim.java
   java Nim

## How to Play

1. The game starts with four rows of sticks, each represented by an array.
2. Players take turns selecting a row and removing a certain number of sticks from that row.
3. The computer also makes moves based on a random strategy.
4. The game continues until there are no sticks left.
5. The player who removes the last stick loses.

## Code Structure

The code is organized into a `Nim` class containing various methods for handling different aspects of the game:

- `methodRandom`: Computer's method to make a random move.
- `methodRow1`, `methodRow2`, `methodRow3`, `methodRow4`: Methods for player's moves on each row.
- `main`: The main game loop where players take turns making moves until the game is over.


## Note

- The game ensures that a player cannot remove less than 1 stick and more than the sticks left in an row.
- It also handles cases where a player tries to remove sticks from a row with no sticks left.

Have fun playing Nim!
