
public class Functons {
	
	public static int a = 30;
	public static int b = 20;
	
	public static void print()
	{
		System.out.println("Learning Functions");
	}
	
	public static void addNumber()
	{
		int c = a + b;
		System.out.println("add : " + c);
	}
	
	public static void addNumbers(int r, int s)
	{
		int c = r + s;
		System.out.println("add : " + c);
	}
	
	public static int addNumber(int r, int s)
	{
		int c = r + s;
		return c;
	}

	public static void main(String[] args) {
		
		print();
		
		addNumber();
		
		addNumbers(30, 40);
		
		int r = addNumber(30, 40);
		System.out.println("result : " + r);
	}

}
