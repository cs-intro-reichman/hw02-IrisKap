/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */


public class Perfect {
	public static void main (String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int sum = 0; 
		String addingStr = " = ";
		for(int i = 1;i<num; i++)
		{
			if(num % i == 0)
			{
				sum += i;
				addingStr += i + " + ";
			}
		}

		if(sum == num)
		{
			addingStr = addingStr.substring(0,addingStr.length()-2);
			System.out.println(num + " is a perfect number since "+ num + addingStr); 
			
		}
		else {
			System.out.println(num + " is not a perfect number");
		}
	}
}
