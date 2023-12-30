/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int i = 0;
		
		while(i < num)
		{
			int j = 0;
			while(j < num*2)
			{
				if(i % 2 == 0)
				{
					if(j % 2 == 0)
						System.out.print("*");

					else System.out.print(" ");
				}
				else {
					if(j % 2 == 0)
						System.out.print(" ");

					else System.out.print("*");
				}
				j++;
			}
			System.out.println();
			i++;

		}
	}
}
