package Accessmodifier;

public class publicaccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mother f = new Mother();
		//f.park;
		System.out.println("The park name "+ f.park);
		
		System.out.println("The method park "+f.showPark());
	}

}

class Mother
{
	//public variable
	public String park = "Public Park";
	
	public String showPark()
	{
		return park;
	}
	
	Mother()
	{
		
	}
}