package haymon.OO.composition;

import haymon.entities.Course;
import haymon.entities.Student;
import haymon.myMethods.My;

public class ManyToMany {
    public static void main(String[] args) {

        Student s1 = new Student("Mike");
        Student s2 = new Student("Jorge");
        Student s3 = new Student("Anna");
        Student s4 = new Student("Fred");

        Course c1 = new Course("Design");
        Course c2 = new Course("Architecture");
        Course c3 = new Course("Engineering");
        Course c4 = new Course("Arts");
        Course c5 = new Course("Computing");

        s1.doCourse(c1);
        s1.doCourse(c2);

        s2.doCourse(c2);

        s3.doCourse(c3);
        s3.doCourse(c4);
        s3.doCourse(c5);

        s4.doCourse(c1);

        My.print(s3);
        My.print(c2);

        Student s = s3;

        System.out.println(
                s.getName() + " is registered in " +
                s.getCourses().size() + " course(s).");

        Course c = c3;

        System.out.println(
                c.getName() + " course has " +
                c.getStudents().size() + " student(s).");
    }
}
