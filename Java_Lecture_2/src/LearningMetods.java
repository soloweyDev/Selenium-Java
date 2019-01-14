
public class LearningMetods {

	int i; //declation, intialise
	
	int j;
	//Return type --> dataType of the value returned by method
	//Keyword --> return
	
	public void show()
	{
		int a;
		int b;
		String c;
	}
	
	public int display(int k, String s, char c, float f, boolean b) // declare --> define
	{ //starts
		
		/*
		 * 
		 * all definitions goes here !!!
		 *
		 */
		int j;
		System.out.println("Inside Display Metod");
		
		return 0; // last statement
		
	} //ends
	
	public static void main(String[] args) {
		/*
		LearningMetods l = new LearningMetods();
		l.display(10, "test", 'a', 1.0f, true);
		l.show();
		
		System.out.println("Hi Now are you");*/
		
		/*LearningMetods learn = new LearningMetods();
		learn.show();
		learn.i = -1;
		
		LearningMetods learn1 = new LearningMetods();
		learn1.show();*/
		/*
		Home h = new Home();
		h.i++;
		
		Home h1 = new Home();
		h1.i++;
		
		Home h2 = new Home();
		System.out.println(h2.i);*/
		
		Calculator calc = new Calculator();
		int temp = calc.getSum(10, 20);
		System.out.println(temp);
		
		System.out.println(calc.getMult(10, 2));
		
		double i = Math.PI;
	}

}
