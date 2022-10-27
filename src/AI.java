
public class AI {
	
	      static int min = 1;
	      static int max = 9;
	      static int random_int = 0;	
	
	public static void main( String args[] ) {

		randomNumber();
		
	    }

	
	public static void randomNumber() {		
		  //Generate random int value from 50 to 100 

		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		System.out.println(random_int);		
	}	
	
	public static void aiTurn() {
		randomNumber();
		while (Player.playerOne == false) {
			if (random_int == 1) { 
				if (MyFrame.button1.getModel().isPressed() == false) {			
					MyFrame.button1.doClick();				
				} else if (MyFrame.button1.getModel().isPressed() == true) {
					randomNumber();
					aiTurn();
				}
			} else if (random_int == 2) { 
				if (MyFrame.button2.getModel().isPressed() == false) {
					MyFrame.button2.doClick();
				} else if (MyFrame.button2.getModel().isPressed() == true) {
					randomNumber();
					aiTurn();
				}
			} else if (random_int == 3) { 
				if (MyFrame.button3.getModel().isPressed() == false) {
					MyFrame.button3.doClick();
				} else if (MyFrame.button3.getModel().isPressed() == true) {
					randomNumber();
					aiTurn();
				}				
			} else if (random_int == 4) { 
				if (MyFrame.button4.getModel().isPressed() == false) {
					MyFrame.button4.doClick();
				} else if (MyFrame.button4.getModel().isPressed() == true) {
					randomNumber();
					aiTurn();
				}				
			} else if (random_int == 5) { 
				if (MyFrame.button5.getModel().isPressed() == false) {
					MyFrame.button5.doClick();
				} else if (MyFrame.button5.getModel().isPressed() == true) {
					randomNumber();
					aiTurn();
				}				
			} else if (random_int == 6) { 
				if (MyFrame.button6.getModel().isPressed() == false) {
					MyFrame.button6.doClick();
				} else if (MyFrame.button6.getModel().isPressed() == true) {
					randomNumber();
					aiTurn();
				}				
			} else if (random_int == 7) { 
				if (MyFrame.button7.getModel().isPressed() == false) {
					MyFrame.button7.doClick();
				} else if (MyFrame.button7.getModel().isPressed() == true) {
					randomNumber();
					aiTurn();
				}				
			} else if (random_int == 8) { 
				if (MyFrame.button8.getModel().isPressed() == false) {
					MyFrame.button8.doClick();
				} else if (MyFrame.button8.getModel().isPressed() == true) {
					randomNumber();
					aiTurn();
				}				
			} else if (random_int == 9) { 
				if (MyFrame.button9.getModel().isPressed() == false) {
					MyFrame.button9.doClick();
				} else if (MyFrame.button9.getModel().isPressed() == true) {
					randomNumber();
					aiTurn();
				}				
			}			
		}		
	}
}
