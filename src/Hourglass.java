/*This is my commit block. I'm going to break this up into the top and bottom 
 * line into one method, the triangle for the top, the triangle for the bottom
 * and the middle. The triangle needs to have spacing that changes per line 
 * and colons that changes per line.
*/

public class Hourglass {
	public static void main(String args[] ) {
		topBottom();
		topLayers();
		middle();
		bottomLayers();
		topBottom();
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
			for (int i = 1; i<= 5 - line ; i++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for (int j = 1; j<= line * 2; j ++) {
				System.out.print(":");
				}
				System.out.print("\\");
				System.out.println("");
			}
			}
		}
	












