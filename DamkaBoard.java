/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);

		// #feedback: better to use here for loops...
		for (int i = 0; i < num; i++)
		{
			for (int j = 0; j < num; j++)
			{
				if(i % 2 == 0)
				{
					// #feedback why not to print both ' ' and '*' together?
					// #feedback use always {} to scope even when there is only one line.
					System.out.print("* ");
				}
				else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
