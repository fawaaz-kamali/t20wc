# 2024 T20 (T10) Cricket World Cup USA/West Indies

<b>Created by: fawaaz-kamali</b>

## Table of Contents

1. [Introduction](#introduction)
2. [Game Mechanics](#game-mechanics)
3. [Installation](#installation)
4. [Usage](#usage)
5. [Contribution](#contribution)


## Introduction 

This terminal-based Cricket World Cup game is inspired by the classic middle school game popularly known in Asia as “odd-even.” The game captures the excitement of cricket by incorporating batting and bowling strategies into a simple yet engaging mechanic. The game adds an extra layer of depth with player ratings, making it both strategic and fun to play.


## Game Mechanics

The rules of the game are straightforward:
1. Two players (batsman and bowler) guess a number within a given range.
2. If the numbers guessed by both players are the same, the batting side is out.
3. If the numbers are different, the batting team scores runs equal to the number they guessed.

### Player Ratings and Range Adjustments

<ul>
    <li>Each player has a rating: bowling rating for the bowler and batting rating for the batsman.</li>
    <li>The difference in these ratings affects the range of numbers that can be guessed:</li>
    <ul>
        <li>If the rating difference <= 15, range remains 1-6 (normal)</li>
        <li>If rating difference > 15 in favor of bowler, the range decreases by 1 for every 10 additional rating difference (e.g., 1-5, 1-4, etc.)</li>
        <li>If the rating difference > 15 in favor of the batsman, the range increases by 1 for every 10 additional rating points (e.g., 1-7, 1-8, etc.).</li>
    </ul>
</ul>
This mechanic ensures that the game reflects the competitive edge provided by individual player ratings, adding a realistic and exciting element to gameplay.

The World Cup follows a single-game knockout format starting from the Round-of-16. Following each game, player statistics (for the user's team) are saved such as wickets and runs scored. The remaining tournament is simulated. The user has an option to save progress and quit the program.

WARNING: DO NOT TOUCH OR TRY TO EDIT THE progress.txt FILE!


## Installation

Follow the steps below to set up the game on your system. These instructions are tailored for users without prior Java or programming experience.

### Step 1: Download the Repository

1. Visit the [GitHub repository](https://github.com/fawaaz-kamali/t20wc).
2. Click the green Code button and select Download ZIP.
3. Extract the downloaded ZIP file and leave it in the Downloads folder.


### Step 2: Install Java

If you have not already, [install Java](https://www.geeksforgeeks.org/download-install-java-windows-linux-macos/) in accordance to your operating system.


## Usage

Once Java is installed, follow these steps to run the game: 
1. Open your terminal / Powershell and navigate to the Downloads folder. Use the following command as soon as your terminal / Powershell loads up: 

`cd ~/Downloads`

2. Compile the Java files:

`javac src/main/Main.java`

3. Run the game:

`java -cp src/main Main`

4. Follow the on-screen instructions to enjoy the game!


## Contribution

This project was developed as a fun way to combine programming with cricket strategy. Contributions and feedback are welcome! If you'd like to improve the game, fork the repository and submit a pull request. 
