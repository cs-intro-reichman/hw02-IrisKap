/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

		int random = (int)(Math.random() * 10);
		int randomNext = (int)(Math.random() * 10);
		System.out.print(random + " ");
;
		while(randomNext > random)
		{
			System.out.print(randomNext + " ");
			random = randomNext; 
			randomNext = (int)(Math.random() * 10);
			
		}
		
	}
}
