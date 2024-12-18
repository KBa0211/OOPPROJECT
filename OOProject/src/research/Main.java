package research;
import java.util.ArrayList;

public class Main {
	public static void main(String [] args) {
		Teacher teacher = new Teacher("name", 1, "email", "password", "message", "complain");
		System.out.println(teacher.sendMessages());
		System.out.println(teacher.sendComplaints());
		ArrayList<String> students = new ArrayList<String>();
		ArrayList<String> courses = new ArrayList<String>();
		
		students.add("student");
		courses.add("oop");
		
		teacher.putMarks(students, courses, 2);
	}

}
