
public class Departments implements Emloyee{

	public static void main(String[] args) {
		
		Emloyee e = new  Departments();
		e.salary();
		e.hr_policy();

	}

	@Override
	public void salary() {
		
		System.out.println("Salary granted for this minth");
		
	}

	@Override
	public void hr_policy() {
		
		System.out.println("HR policies applied");
		
	}

}
