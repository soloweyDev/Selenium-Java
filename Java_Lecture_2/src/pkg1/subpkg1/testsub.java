package pkg1.subpkg1;

import teacher.teacherLogin;
import teacher.teacherSubject;

public class testsub {

	public static void main(String[] args) {
		
		teacherLogin teacher = new teacherLogin();
		teacher.testTeacherLogin();
		teacher.name = "Raman";
		
		teacherSubject subject = new teacherSubject();
		subject.subject = "Selenium";

	}

}
