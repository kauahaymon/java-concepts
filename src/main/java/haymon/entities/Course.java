package haymon.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    final private List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void registerStudent(Student student) {
        students.add(student);
        student.getCourses().add(this);
    }

    public List<String> getCoursesOf() {
        return students.stream().map(s -> s.getName()).toList();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", students=" + getCoursesOf() +
                '}';
    }
}
