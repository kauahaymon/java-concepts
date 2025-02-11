package haymon.entities;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    final private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void doCourse(Course course) {
        courses.add(course);
        course.getStudents().add(this);
    }

    public List<String> getStudentCoursesOf() {
        return courses.stream().map(c -> c.getName()).toList();
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + getStudentCoursesOf() +
                '}';
    }
}
