
public class MetodCalling {

	public static void main(String[] args) {

		MetodCalling m = new MetodCalling();
		m.go();
		
		go3("main()");
	}

	public void go()
	{
		System.out.println("Inside go method");
		go1();
		go3("go()");
	}
	
	public void go1()
	{
		System.out.println("Inside go1 method");
		go2();
	}
	
	public void go2()
	{
		System.out.println("Inside go2 method");
	}
	
	public static void go3(String s)
	{
		System.out.println("Inside go3 method in " + s);
	}
}
