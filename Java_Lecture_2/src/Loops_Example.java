
public class Loops_Example {

	public static void main(String[] args) {
		
		int i = 1;
		
		do
		{
			System.out.println("Number id : " + i);
			i++;
		}
		while(i < 10);

		while(i < 10)
		{
			System.out.println("Number id: " + i);
			i++;
		}
		
		for (int x = 1; x < 10; x++)
		{
			System.out.println("Value of X is : " + x);
		}
		
		System.out.println("***********************************************");
		
		for (int x = 20; x >= 1; x = x - 2)
		{
			System.out.println("even number are : " + x);
		}
		
		for (int x = 1; x <= 10; x++)
		{
			System.out.println("table of 2 is : " + 3 * x);
		}
		
		for (int table = 1; table <= 10; table++)
		{
			System.out.println("table of --- " + table);
			for (int x = 1; x <= 10; x++)
			{
				System.out.println(table + "*" + x + "=" + table * x);
			}
			
			if (table == 6)
				break;
		}
		
		System.out.println("***********************************************");
		
		int p = 1;
		System.out.println(p++);
		System.out.println(p);
		
		int q = 5;
		System.out.println(++q);
	}

}
