public class Player {
	
static boolean playerOne = true;
static int drawCounter = 0;

	public static void TurnCount() {
		
		//Switches between being player 1 or 2
		if (playerOne == true) {
			playerOne = false;
			drawCounter++;
		} else {
//			AI.aiTurn();
			playerOne = true;
			drawCounter++;
		}		
	}
}
