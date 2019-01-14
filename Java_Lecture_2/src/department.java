
public class department {

	// не статический глобавльные значения
		public String dept_name;
	public int dept_id;
	public int no_of_emp;
	
	// статичекое глабальное значение
	public static String comp_name;
	
	// не статические функции
	public void add_dept()
	{
		System.out.println("Deportament added");
	}
	
	public void change_dept()
	{
		System.out.println("Deportament changed");
	}
	
	// статические функции
	public static void national_holiday()
	{
		System.out.println("National holiday");
	}
}
