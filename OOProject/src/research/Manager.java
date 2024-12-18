package research;

import java.util.ArrayList;
import java.util.List;

public class Manager  extends Employee {
    private List<String> courses;
    public Manager(String name, int id, String email, String password) {
        super(name, id, email, password);
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course){
        courses.add(course);
        System.out.println("Course " + course + " added.");
    }

    public List<String> getCourses() {
        return courses;
    }
}
