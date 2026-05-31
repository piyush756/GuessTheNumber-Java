# Guess The Number Game 🎮

A simple, interactive command-line interface (CLI) game built using Java. The program generates a random number between 0 and 100, and the player has to guess it.

## 🚀 Features
- **Dynamic Hints:** Tells you if your guess is too high or too low.
- **Graceful Exit:** Type `n` or `N` at any point during the game to quit.
- **Crash Prevention:** Includes robust input validation (`try-catch`) so the game won't crash if you accidentally type letters or symbols instead of a number.

## 🛠️ Technologies Used
- **Java** (Core logic, loops, and conditional statements)
- `java.util.Scanner` (For reading user input)
- `java.util.Random` (For generating the secret number)

## 📖 How to Run
1. Clone this repository or download the `GuessGame.java` file.
2. Open your terminal or command prompt and navigate to the file location.
3. Compile the file:
   ```bash
   javac GuessGame.java
