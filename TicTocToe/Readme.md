# Tic Tac Toe (Java Console Game)

A simple **Tic Tac Toe (N x N board)** game built in Java for console/terminal.  
Supports **custom board size** (e.g., 3x3, 4x4, etc.) and lets two players (`X` and `O`) play turn by turn.


<img width="890" height="1080" alt="Screenshot (28)" src="https://github.com/user-attachments/assets/aaf74011-15dc-47d6-9fef-ceb5194a3b53" />


---

## 🎮 Features
- Playable in **console/terminal**.
- **Custom board size** (default is 3x3, but you can choose `n x n`).
- Detects:
  - ✅ Winning condition (row / column / diagonal).
  - ✅ Draw condition when the board is full.
- Prevents invalid moves.

---

## 🛠️ How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/<your-username>/JavaTerminalGames.git
Navigate to the TicTacToe folder:

bash
Copy code
cd JavaTerminalGames/TicTocToe
Compile the program:

bash
Copy code
javac TicTocToe.java
Run the program:

bash
Copy code
java TicTocToe
🎯 Gameplay Instructions
When the game starts, enter the board size (e.g., 3 for a 3x3 board).

Players take turns:

Player X starts first.

Enter the row and column index (0-based).

Example:

mathematica
Copy code
Player (X): Enter the Row and Column:
1 2
This will place X at row 1, column 2.

Game ends when:

A player wins (three or more in a line depending on board size).

OR the board is full → Draw.

🖼️ Example (3x3 board)
diff
Copy code
- - -
- - -
- - -

Player (X): Enter the Row and Column:
0 0

X - -
- - -
- - -
📌 Future Improvements
Add AI opponent (single player mode).

Add scoreboard.

Improve board UI with grid lines.
