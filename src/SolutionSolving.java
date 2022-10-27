import javax.swing.JOptionPane;

public class SolutionSolving{

int winnerRow = 0;
int winnerColumn = 0;
int winnerDiagonalX = 0;
int winnerDiagonalO = 0;
boolean winnerDeclared = false;

public String[][] xOrO = {
			{"blank","blank","blank"},
			{"blank","blank","blank"},
			{"blank","blank","blank"}
			};

    //{"X","X","X"}
 	//{"O","O","O"}
 	//{"blank","blank","blank"}
//	public static void main(String[] args) {       
//		
//    	for (String[] x : xOrO) {
//            for (String i : x) {
//                System.out.print(i + "\t");
//            }
//            System.out.println("\n");
//            
//        }
//		checkWinner();
//	}

	//Sets the value of X or O depending on player 1 or 2 in the 2D ArrayList
	public void setValue() {
		
		if(MyFrame.button1.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				// Set 2D ArrayList [0][0] to "X"
				xOrO[0][0] = "X";
			} else {
				// Set 2D ArrayList [0][0] to "O"
				xOrO[0][0] = "O";
			}
			
		} else if(MyFrame.button2.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[0][1] = "X";
			} else {
				xOrO[0][1] = "O";				
			}	
			
		} else if(MyFrame.button3.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[0][2] = "X";
			} else {
				xOrO[0][2] = "O";				
			}		
			
		} else if(MyFrame.button4.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[1][0] = "X";
			} else {
				xOrO[1][0] = "O";			
			}		
			
		} else if(MyFrame.button5.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[1][1] = "X";
			} else {
				xOrO[1][1] = "O";				
			}	
			
		}  else if(MyFrame.button6.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[1][2] = "X";
			} else {
				xOrO[1][2] = "O";				
			}	
			
		}  else if(MyFrame.button7.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[2][0] = "X";
			} else {
				xOrO[2][0] = "O";				
			}	
			
		}  else if(MyFrame.button8.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[2][1] = "X";
			} else {
				xOrO[2][1] = "O";			
			}	
			
		}  else if(MyFrame.button9.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[2][2] = "X";
			} else {
				xOrO[2][2] = "O";			
			}	
			
		} else {
			System.out.println("This may be broken :(");
		}		
	}
	
	public void checkWinner() {
		checkRows();
		checkColumns();
		checkDiagonals();
	}
	
	//Will check each row of the 2D ArrayList for possible win conditions
	public void checkRows() {	
		for (int i = 0; i < xOrO.length; i++) {			 
			for(int j = 0; j < xOrO[i].length; j++) {
				if (xOrO[i][j] == "X" ) {
					winnerRow++;
					winnerDisplay();		
				} else if (xOrO[i][j] == "O" ) {
					winnerRow--;
					winnerDisplay();					
				} else {											
					winnerRow = 0;
					break;
				}
			}
			winnerRow = 0;
		}
	}
	
	//Will check each column of the 2D ArrayList for possible win conditions
	public void checkColumns() {
		for (int i = 0; i < xOrO[0].length; i++) {			 
			for(int j = 0; j < xOrO.length; j++) {
				if (xOrO[j][i] == "X" ) {
					winnerColumn++;
					winnerDisplay();		
				} else if (xOrO[j][i] == "O" ) {
					winnerColumn--;
					winnerDisplay();					
				} else {											
					winnerColumn = 0;
					break;
				}
			}
			winnerColumn = 0;
		}
	}
	
	//Will check each diagonal of the 2D ArrayList for possible win conditions
	public void checkDiagonals() {		
		//needs winnerDisplay();
		if (xOrO[0][0] == "X" && xOrO[1][1] == "X" && xOrO[2][2] == "X") {
			winnerDiagonalX = 1;
			winnerDisplay();
		} else if (xOrO[0][0] == "O" && xOrO[1][1] == "O" && xOrO[2][2] == "O") {
			winnerDiagonalO = -1;
			winnerDisplay();
		} else if (xOrO[0][2] == "X" && xOrO[1][1] == "X" && xOrO[2][0] == "X") {
			winnerDiagonalX = 1;
			winnerDisplay();
		} else if (xOrO[0][2] == "O" && xOrO[1][1] == "O" && xOrO[2][0] == "O") {
			winnerDiagonalO = -1;
			winnerDisplay();
		} 
	}
	
	//Will check if each way causes a winner to occur
	public void winnerDisplay() {
		if (winnerRow == 3) {
			winnerDeclared = true;
			JOptionPane.showMessageDialog(null, "Player 1 wins! Let's again!","Winner", 
					JOptionPane.PLAIN_MESSAGE, null);
			reset();
		} else if (winnerRow == -3) {
			winnerDeclared = true;
			JOptionPane.showMessageDialog(null, "Player 2 wins! Let's again!","Winner", 
					JOptionPane.PLAIN_MESSAGE, null);
			reset();
		} else if (winnerColumn == 3) {
			winnerDeclared = true;
			JOptionPane.showMessageDialog(null, "Player 1 wins! Let's again!","Winner", 
					JOptionPane.PLAIN_MESSAGE, null);
			reset();
		} else if (winnerColumn == -3) {
			winnerDeclared = true;
			JOptionPane.showMessageDialog(null, "Player 2 wins! Let's again!","Winner", 
					JOptionPane.PLAIN_MESSAGE, null);
			reset();
		} else if (winnerDiagonalX == 1) {
			winnerDeclared = true;
			JOptionPane.showMessageDialog(null, "Player 1 wins! Let's again!","Winner", 
					JOptionPane.PLAIN_MESSAGE, null);
			reset();
		} else if (winnerDiagonalO == -1) {
			winnerDeclared = true;
			JOptionPane.showMessageDialog(null, "Player 2 wins! Let's again!","Winner", 
					JOptionPane.PLAIN_MESSAGE, null);
			reset();
		} else if (winnerDeclared == false && Player.drawCounter == 9) {
			JOptionPane.showMessageDialog(null, "Nobody won :( ! Let's again!","Draw", 
					JOptionPane.PLAIN_MESSAGE, null);
			reset();
		}
	}
	
	//Needs to reset the 2D ArrayList, as well as resetting the JButtons
	public void reset() {
		for (int i = 0; i < xOrO.length; i++) {			 
			for(int j = 0; j < xOrO[i].length; j++) {
				xOrO[i][j] = "blank";
			}	
		}
		MyFrame.button1.setEnabled(true);
		MyFrame.button2.setEnabled(true);
		MyFrame.button3.setEnabled(true);
		MyFrame.button4.setEnabled(true);
		MyFrame.button5.setEnabled(true);
		MyFrame.button6.setEnabled(true);
		MyFrame.button7.setEnabled(true);
		MyFrame.button8.setEnabled(true);
		MyFrame.button9.setEnabled(true);
		MyFrame.button1.setIcon(MyFrame.blankButton);
		MyFrame.button2.setIcon(MyFrame.blankButton);
		MyFrame.button3.setIcon(MyFrame.blankButton);
		MyFrame.button4.setIcon(MyFrame.blankButton);
		MyFrame.button5.setIcon(MyFrame.blankButton);
		MyFrame.button6.setIcon(MyFrame.blankButton);
		MyFrame.button7.setIcon(MyFrame.blankButton);
		MyFrame.button8.setIcon(MyFrame.blankButton);
		MyFrame.button9.setIcon(MyFrame.blankButton);
		winnerColumn = 0;
		winnerRow = 0;
		winnerDiagonalX = 0;
		winnerDiagonalO = 0;
		Player.playerOne = true;
		Player.drawCounter = 0;
		winnerDeclared = false;
	}
}
