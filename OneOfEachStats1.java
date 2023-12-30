/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
	
		int num = Integer.parseInt(args[0]);
		String gender;
		String wantedGender;
		int count2 = 0;
		int count3 = 0;
		int count4Plus = 0;
		int sumOfIterations = 0;
		for(int i =0; i < num; i++)
		{
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

			//System.out.print(gender + " ");

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

				//System.out.print(gender + " ");
			}
			if(kids == 2)
				count2++;

			else if(kids == 3)
				count3++;

			else count4Plus++;

			sumOfIterations += kids;
			//System.out.println();
			//System.out.println(sumOfIterations);
		}

		
		double avarage = ((double)sumOfIterations)/num;

		System.out.println("Average: " + avarage + " children to get at least one of each gender." );
		System.out.println("Number of families with 2 children: " + count2);
		System.out.println("Number of families with 3 children: " + count3);
		System.out.println("Number of families with 4 or more children: " + count4Plus);

		String maxKids;
		if(Math.max(count2, Math.max(count3, count4Plus))== count2)
		{
			maxKids = "2.";
		}
		else if(Math.max(count2, Math.max(count3, count4Plus))== count3)
		{
			maxKids = "3.";
		}
		else
		{
			maxKids = "4 or more.";
		}

		System.out.println("The most common number of children is " + maxKids);

	}
}
