
public class SolutionSolving{
	
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
    
}
