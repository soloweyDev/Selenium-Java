
public class BreakAndContinue {
	
	public void go()
	{
		System.out.println("First");
		
		// break; --> loop & switch
		// continue; --> loop
		
		System.out.println("Last");
	}

	public static void main(String[] args) {
		
		BreakAndContinue b = new BreakAndContinue();
		b.go();
		
		for (int i = 0; i < 10; i++)
		{
			/*if(i == 5)
				break;*/
			
			if(i > 5 && i < 9)
				continue;
			
			System.out.println(i);
		}

		System.out.println("Outside the loop");
	}

}
