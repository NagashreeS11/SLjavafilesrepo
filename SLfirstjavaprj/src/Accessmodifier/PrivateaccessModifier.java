package Accessmodifier;

//public class- accesable anywhere
public class PrivateaccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father f = new Father();
		

	}

}

//default class - that is accesable within package
class Father
{
	//private variable - accesable only within class
	private double bankMoney;
	
	private String showletters()
	{
		return "Private Letters";
	};
	
	Father()
	{
		
	}
}