package TypeCasting;

public class typecastingdemo1 {
	
	public static void main(String args[])
	{
	
	//1.widening or implicit typecasting
	
	int luckyno=7;
	double price = 23.67;
	byte age = 10;
	
	System.out.println("Value of Lucky number " + luckyno);
	
	//widening from int to float
	float floatnum = luckyno;	
	System.out.println("Value of float Lucky number " + floatnum);

	//widening from float to double
	double doublenum = floatnum;
	System.out.println("Value of double Lucky number " + doublenum);
	
	
	System.out.println("Value of price " + price);

	//float newPrice = price;
	

	}

}
