
public class WhileLoop {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10)
		{
			System.out.println(i);
			i++;
		}
		
		System.out.println("After loop");
		
		do
		{
			System.out.println(i);
			i++;
		}
		while(i <= 10);

		System.out.println("After loop2");
	}

}
