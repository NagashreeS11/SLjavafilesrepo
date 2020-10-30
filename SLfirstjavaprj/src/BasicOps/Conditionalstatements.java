package BasicOps;

import java.util.Scanner;

public class Conditionalstatements {
	
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter y/n");
		char response = s1.nextLine().charAt(0);
	if (response == 'y')
	{
		System.out.println("You entered yes");
	}
	else
	{
		System.out.println("You entered no");
	}
	s1.close();
	}

}
