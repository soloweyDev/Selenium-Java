
public class swapnumbers {
	
	int s;
	int t;
	
	public static void swap(int a, int b) // работа со значением
	{
		int temp = a;
		a = b;
		b = temp;
	}

	public static void swap(swapnumbers p) // работа по ссылке
	{
		int temp = p.s;
		p.s = p.t;
		p.t = temp;
	}
	
	public static void main(String[] args) {
		
		swapnumbers sw = new swapnumbers();
		sw.s = 50;
		sw.t = 100;
		swap(sw.s, sw.t);
		System.out.println("s = " + sw.s);
		System.out.println("t = " + sw.t);

		swap(sw);
		System.out.println("s = " + sw.s);
		System.out.println("t = " + sw.t);
	}

}
