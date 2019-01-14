
public class Day1 {
	
	public static void main(String args[])
	{
		Day1 day = new Day1();
		
		System.out.println(day);
		
		day = null;
		
		Home h;

		for(int i =  0; i < 10000; ++i)
		{
			h = new Home();
			System.out.println(i);
		}
	}
}
