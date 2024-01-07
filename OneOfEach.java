
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {

		// #feedback: this code could be much simpplier - but you wrote it perfectly such anyone can understand it - beautiful!
		String gender;
		String wantedGender;
		int kids = 1;
		int random = (int)(Math.random() * 10);
		if(random >= 5)
		{
			gender = "g";
			wantedGender = "b";
		}
		else 
		{
			gender = "b";
			wantedGender = "g";

		}

		System.out.print(gender + " ");

		while(!gender.equals(wantedGender))
		{
			random = (int)(Math.random() * 10);
			kids++;
			if(random >= 5)
			{
				gender = "g";
			}
			else 
			{
				gender = "b";
			}

			System.out.print(gender + " ");
		}

		System.out.println("\nYou made it... and you now have "+ kids + " children");

	}
}
