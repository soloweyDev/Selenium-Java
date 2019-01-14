
public class IFElseStatememts {

	public static void main(String[] args) {

		double num = Math.random() * 100;
		System.out.println(num);
		
		if(true)
		{
			System.out.println("if = true");
		}

		if (num > 50)
		{
			System.out.println(num + " is Greater than 50");
		}
		else if (num < 50 && num > 25)
		{
			System.out.println(num + " between 50 and 25");
		}
		else
		{
			System.out.println(num + " is Less than 50");
		}
	}

}
