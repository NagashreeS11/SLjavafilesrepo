package TypeCasting;

public class Narrowingtypecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double price =149.34;
		
		System.out.println("Price value "+ price);
		
		int intPrice = (int) price; //Explicit type converstion or narrowing
		System.out.println("int Price value "+ intPrice);

		float floatPrice = (float) price;
		System.out.println("float Price value "+ floatPrice);

	}

}
