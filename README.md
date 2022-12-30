# TikTacToe

#### Video Demo:  <https://youtu.be/Dc2jj2oAOUo>

#### Description:

#### Initial project choice and thoughts:

So originally when I started looking in to programming and learning about all this is as much depth it comes from my friend Alex suggesting that with my past history in QA and gaming that it could be something that would interest me. From that and having taken a computer science class back in the day immediately after coming out of high school and not taking things too serious and having some faint idea and memory of what it entailed I was happy to jump in to it. I was suggested to start with java by him, which if why I thought doing my final project would be best done in that language. He also gave me some suggestions of some projects to practice on and get myself situated. One of those being the classic game of Tic-Tac-Toe. Although its not an original project by any means, I was happy to jump in to it fairly blind with having overall such little knowledge and practice in programming and seeing what I could put together.

My buddy Alex had made the suggestion of it to be fairly simple using the terminal window to print out the 3x3 box and have the user simply type in the choice of where to go on their turn but I felt like that would have been, not too simple, but, not engaging enough in today's world. I wanted to push myself a bit and make something visual, albeit simple using a GUI as if it were a real game/app someone could launch on their end and easily and intuitively play.

#### Project skeleton:

+ GUI Body:
	Overall a simple GUI design, nothing more than to fit the 3x3 body/grid other than the menu items and bar at the top.
+ Art and Icons:
	Some custom made quick MS Paint icons for the program as well as for changing the blank buttons to an X or O for each player.
+ Buttons: 
	Tied in with the GUI and art, 9 simple buttons in a 3x3 grid represented by a 2D ArrayList 
+ Player logic:
	A simple function would be needed to just flip flop back and forth between "Player 1"/"X" and "Player 2"/"O"
+ Logic:
	A logic to solve and verify if someone has met a winning condition and thus end the match.
	
#### Files:

+ Main:

	This file is used purely to launch the the MyFrame where all the GUI goodness will be seen and interacted with.
	
+ MyFrame:

	I do believe I put too much in to this file but I couldnt quite think at the time of a better way. The first portion of the file is to build the entire GUI that the user would be looking at and interacting with . Adding the menu buttons (some extra flair), app icon, custom title, the 3x3 button grid with action listeners. 
	
	In the ActionListener section of this file is when I fell in to the trap and not following the laws of not repeating myself. It was simply easier for me to just repeat myself for each of the 9 buttons of the grid to have each do specifically what I wanted but if I had more time to look in to it I would like to redo this part of the program first to be less repetitive.
	
	Finally at the bottom I just have a little function for painting the lines of the tic-tac-toe board so it looks true to itself as opposed to just being oddly blank	
	
+ Player:

	The Player.java file is a simple function to just swap between which player's turn it is, while also counting up a counter to check in case a draw occurs once the final/9th button is pressed and no winner is declared.
	
+ SolutionSolving:

	This file handles 3 main things just like in MyFrame, but I should have split this into separate files as well. Firstly any time any of the buttons are pressed, the SolutionSolving is called to check whom clicked the button and set that button's value in the 2D ArrayList to match the X or O.
	
	From there, we check the horizontal, vertical and diagonals of the 2D ArrayList to see for 3 matching if a winner has been found, which results in a pop up informing which player just won (or if none, a draw).
	
	Finally once more is the reset function which resets everything back to their default values and states so that a new round can be started.
	
+ AI:

	The bane of this project and my existence working on this. Trying to make an AI to randomly select one of the unpressed buttons on the game after the player takes their turn. I sadly do not have enough time to work on this more for now, but certainly want to get back and fix it to finish the project to completion. The idea was that, after the player takes their turn, it would switch to the AI's turn where they would randomly choose a number between 1-9 (for the 9 buttons) and if it was unpressed thus far, choose to play there, else if its already been used, try again till it finds an unused button. Unfortunately, it doesnt seem to work automatically and requires a user input to trigger, which it then takes a random amount of turns, making it nearly impossible to win against.
	
#### Conclusion:
Ultimately I had a lot of fun working on this simple game into a visual game and will be looking forward to finding the free time available to dive back in to it and make it a complete program instead of what it is. For the regular usage of it, I have decided to keep the AI portion of the program disabled so that it is still usable for 2 people sat at the same computer to play together. So I consider that a minor victory.
	
	
	