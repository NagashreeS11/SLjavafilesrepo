package Accessmodifier;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add a = new add();
		System.out.println("The total Value "+ a.add1());
		
		sub s = new sub();
		System.out.println("The remaining Value "+ s.sub1());
	}

}

class add{
	
	private int num1=200;
	private int num2=100;
	
	public int add1()
	{
		return num1+num2;
	}
	
	
}

class sub{
	
	private int num1=200;
	private int num2=100;
	
	public int sub1()
	{
		return num1-num2;
	}
}

class div{
	
}

class Mul{
	
}