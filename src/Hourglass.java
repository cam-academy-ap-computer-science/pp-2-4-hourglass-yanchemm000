/*This is my commit block where I am supposed to tell you how I plan to do this.
Problem is, I don't know what I'm going to do yet. RETYPE LATER
*/

public class Hourglass {
	public static void main(String args[] ) {
		topBottom();
		topLayers();
		middle();
		bottomLayers();
	}
	public static void topBottom () {
		System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
	}
	public static void topLayers () {
		/*this gives me the top half of the hour glass*/
		for (int line=1; line <= 4; line++) {
			/*This makes it so that it will add spaces before of 
			 * the hour glass to give it its shape
			 */
			for (int i = 1; i<= (line); i++) {
				System.out.print(" ");
			}
			/*this is for a line*/
			System.out.print("\\");
			for (int j = 1; j<=(10-(line * 2)); j++) {
				System.out.print(":");
			}
			System.out.println("/");
		}
		
		
		
	}
	public static void middle () {
		System.out.println("     ||");
	}
	
	
	public static void bottomLayers() {
		for (int line = 1; line <= 4; line++) {
			for (int i = 1; i<= 4 - line; i++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for (int j = 1; j<= 4; j ++) {
				for(int i=1; i<= j * 2; i++) {
				System.out.print(":");
			}
			System.out.println("\\");
			
		}
	}
	
}
}










