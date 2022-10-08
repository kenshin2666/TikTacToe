public class Player {
	
static boolean playerOne = true;

	public static void TurnCount() {
		
		//Switches between being player 1 or 2
		if (playerOne == true) {

			playerOne = false;
			
		} else {

			playerOne = true;
			
		}		
	}
}
