import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SolutionSolving{

static int winnerRow = 0;
static int winnerColumn = 0;

public static String[][] xOrO = {
			{"blank","blank","blank"},
			{"blank","blank","blank"},
			{"blank","blank","blank"}
			};
    //{"X","X","X"}
 	//{"Y","Y","Y"}
 	//{"blank","blank","blank"}
	public static void main(String[] args) {       
		
    	for (String[] x : xOrO) {
            for (String i : x) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
            
        }
		checkWinner();
	}
	//Sets the value of X or O depending on player 1 or 2 in the 2D ArrayList
	public static void setValue() {
		
		if(MyFrame.button1.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				// Set 2D ArrayList [0][0] to "X"
				xOrO[0][0] = "X";
			} else {
				// Set 2D ArrayList [0][0] to "Y"
				xOrO[0][0] = "O";
			}
			
		} else if(MyFrame.button2.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[0][1] = "X";
			} else {
				xOrO[0][1] = "Y";				
			}	
			
		} else if(MyFrame.button3.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[0][2] = "X";
			} else {
				xOrO[0][2] = "Y";				
			}		
			
		} else if(MyFrame.button4.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[1][0] = "X";
			} else {
				xOrO[1][0] = "Y";			
			}		
			
		} else if(MyFrame.button5.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[1][1] = "X";
			} else {
				xOrO[1][1] = "Y";				
			}	
			
		}  else if(MyFrame.button6.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[1][2] = "X";
			} else {
				xOrO[1][2] = "Y";				
			}	
			
		}  else if(MyFrame.button7.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[2][0] = "X";
			} else {
				xOrO[2][0] = "Y";				
			}	
			
		}  else if(MyFrame.button8.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[2][1] = "X";
			} else {
				xOrO[2][1] = "Y";			
			}	
			
		}  else if(MyFrame.button9.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[2][2] = "X";
			} else {
				xOrO[2][2] = "Y";			
			}	
			
		} else {
			System.out.println("This may be broken :(");
		}
		
	}
	
	public static void checkWinner() {
		checkRows();
		System.out.println();
		checkColumns();
		//checkDiagonals();
	}
	//Will check each row of the 2D ArrayList for possible win conditions
	public static void checkRows() {	
		for (int i = 0; i < xOrO.length; i++) {			 
			for(int j = 0; j < xOrO[i].length; j++) {
				if (xOrO[i][j] == "X" ) {
					winnerRow++;
					winnerCount();		
				} else if (xOrO[i][j] == "Y" ) {
					winnerRow--;
					winnerCount();					
				} else {											
					winnerRow = 0;
					break;
				}
			}
			winnerRow = 0;
		}
	}
	
	//Will check each column of the 2D ArrayList for possible win conditions
	public static void checkColumns() {
		for (int i = 0; i < xOrO[0].length; i++) {			 
			for(int j = 0; j < xOrO.length; j++) {
				if (xOrO[j][i] == "X" ) {
					winnerColumn++;
					winnerCount();		
				} else if (xOrO[j][i] == "Y" ) {
					winnerColumn--;
					winnerCount();					
				} else {											
					winnerColumn = 0;
					break;
				}
			}
			winnerColumn = 0;
		}
	}
	
	//Will check each diagonal of the 2D ArrayList for possible win conditions
	public static void checkDiagonals() {		
		
	}
	//Will check if each way causes a winner to occur
	public static void winnerCount() {
		if (winnerRow == 3) {
			JOptionPane.showMessageDialog(null, "Player 1 wins! Let's again!","Winner", 
					JOptionPane.PLAIN_MESSAGE, null);
			reset();
		} else if (winnerRow == -3) {
			JOptionPane.showMessageDialog(null, "Player 2 wins! Let's again!","Winner", 
					JOptionPane.PLAIN_MESSAGE, null);
			reset();
		} else if (winnerColumn == 3) {
			JOptionPane.showMessageDialog(null, "Player 1 wins! Let's again!","Winner", 
					JOptionPane.PLAIN_MESSAGE, null);
			reset();
		} else if (winnerColumn == -3) {
			JOptionPane.showMessageDialog(null, "Player 2 wins! Let's again!","Winner", 
					JOptionPane.PLAIN_MESSAGE, null);
			reset();
		}
	}
	
	//Needs to reset the 2D ArrayList, as well as resetting the JButtons
	public static void reset() {
		for (int i = 0; i < SolutionSolving.xOrO.length; i++) {			 
			for(int j = 0; j < SolutionSolving.xOrO[i].length; j++) {
				SolutionSolving.xOrO[i][j] = "blank";
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
		Player.playerOne = true;
	}
}
