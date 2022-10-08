import java.util.ArrayList;

public class SolutionSolving{
	
public static final String getxOrO = null;
	
 static String[][] xOrO = {
			{"blank","blank","blank"},
			{"blank","blank","blank"},
			{"blank","blank","blank"}
			};
    
	public static void main(String[] args) {       
		
    	for (String[] x : xOrO) {
            for (String i : x) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
		
	}
	
	public static void setValue() {
		
		if(MyFrame.button1.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				// Set 2D ArrayList [0][0] to "X"
				xOrO[0][0] = "X";
		        System.out.println("Button 1 is pressed by player 1");
		        System.out.println(xOrO[0][0]);
			} else {
				// Set 2D ArrayList [0][0] to "Y"
				xOrO[0][0] = "O";
				System.out.println("Button 1 is pressed by player 2");
				System.out.println(xOrO[0][0]);
			}
			
		} else if(MyFrame.button2.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[0][1] = "X";
				System.out.println("Button 2 is pressed by player 1");
			} else {
				xOrO[0][1] = "Y";
				System.out.println("Button 2 is pressed by player 2");				
			}	
			
		} else if(MyFrame.button3.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[0][2] = "X";
				System.out.println("Button 3 is pressed by player 1");
			} else {
				xOrO[0][2] = "Y";
				System.out.println("Button 3 is pressed by player 2");				
			}		
			
		} else if(MyFrame.button4.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[1][0] = "X";
				System.out.println("Button 4 is pressed by player 1");
			} else {
				xOrO[1][0] = "Y";
				System.out.println("Button 4 is pressed by player 2");				
			}		
			
		} else if(MyFrame.button5.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[1][1] = "X";
				System.out.println("Button 5 is pressed by player 1");
			} else {
				xOrO[1][1] = "Y";
				System.out.println("Button 5 is pressed by player 2");				
			}	
			
		}  else if(MyFrame.button6.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[1][2] = "X";
				System.out.println("Button 6 is pressed by player 1");
			} else {
				xOrO[1][2] = "Y";
				System.out.println("Button 6 is pressed by player 2");				
			}	
			
		}  else if(MyFrame.button7.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[2][0] = "X";
				System.out.println("Button 7 is pressed by player 1");
			} else {
				xOrO[2][0] = "Y";
				System.out.println("Button 7 is pressed by player 2");				
			}	
			
		}  else if(MyFrame.button8.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[2][1] = "X";
				System.out.println("Button 8 is pressed by player 1");
			} else {
				xOrO[2][1] = "Y";
				System.out.println("Button 8 is pressed by player 2");				
			}	
			
		}  else if(MyFrame.button9.getModel().isPressed() == true) {
			if (Player.playerOne == true) {
				xOrO[2][2] = "X";
				System.out.println("Button 9 is pressed by player 1");
			} else {
				xOrO[2][2] = "Y";
				System.out.println("Button 9 is pressed by player 2");				
			}	
			
		} else {
			System.out.println("This may be broken :(");
		}
		
	}
/*	
	public static void checkWinner() {
		
		System.out.println("You win!");
		
		if (xOrO[0] == ("X","X","X")) {
			System.out.println("Player 1 wins!");
		} else if (xOrO[1] == ("X","X","X")) {
			
		} else if (xOrO[2] == ("X","X","X")) {
			
		} else if (xOrO[0][0], xOrO[1][0], xOrO[2][0]  == ("X","X","X")) {
			
		}
		
		
		}
		
	}*/
}
        


