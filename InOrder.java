/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

		// #feedback: use do-while loop to avoid duplications of code
		int random = 0;
		do {
			int randomNext = (int)(Math.random() * 10);
			System.out.print(randomNext + " ");
			random = randomNext; 
			randomNext = (int)(Math.random() * 10);
			
		} while(randomNext > random);
		
	}
}
