import java.util.ArrayList;

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
					System.out.println(winnerRow);
					winnerCount();		
				} else if (xOrO[i][j] == "Y" ) {
					winnerRow--;
					System.out.println(winnerRow);
					winnerCount();					
				} else {											
					winnerRow = 0;
					System.out.println(winnerRow);
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
					System.out.println(winnerColumn);
					winnerCount();		
				} else if (xOrO[j][i] == "Y" ) {
					winnerColumn--;
					System.out.println(winnerColumn);
					winnerCount();					
				} else {											
					winnerColumn = 0;
					System.out.println(winnerColumn);
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
			System.out.println("Player 1 wins horizontal");
			winnerRow = 0;
		} else if (winnerRow == -3) {
			System.out.println("Player 2 wins horizontal");
			winnerRow = 0;
		} else if (winnerColumn == 3) {
			System.out.println("Player 1 wins vertical");
			winnerColumn = 0;
		} else if (winnerColumn == -3) {
			System.out.println("Player 2 wins vertical");
			winnerColumn = 0;
		}
	}
}
        


