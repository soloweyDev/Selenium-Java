
public class Company {

	public static void main(String[] args) {
		
		department d = new department();
		
		d.dept_id = 10;
		d.dept_name = "Telecom";
		d.no_of_emp = 1000;
		
		d.add_dept();
		d.change_dept();
		
		System.out.println("Dept id: " + d.dept_id);
		System.out.println("Dept name: " + d.dept_name);
		System.out.println("Dept no_of_emp: " + d.no_of_emp);
		
		department.comp_name = "microsoft";
		department.national_holiday();

	}

}
