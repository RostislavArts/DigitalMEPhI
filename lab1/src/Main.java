import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] marks1 = {4, 5, 3, 4, 5};
        int[] marks2 = {2, 2, 3, 4, 3};
        int[] marks3 = {2, 5, 3, 5, 5};
        int[] marks4 = {2, 3, 3, 3, 2};
        int[] marks5 = {2, 2, 4, 5, 2};
        var stud1 = new Student("Bob", "C23-722", 2, marks1);
        var stud2 = new Student("Alex", "B24-602", 1, marks2);
        var stud3 = new Student("Sam", "C22-103", 3, marks3);
        var stud4 = new Student("Kate", "B23-412", 2, marks4);
        var stud5 = new Student("Ann", "C24-302", 1, marks5);

        var studList = new ArrayList<Student>(Arrays.asList(stud1, stud2, stud3, stud4, stud5));
        toNextCourse(studList);

        searchByCourse(studList, 2); // This should display Kate and Ann
    }

    public static void toNextCourse(List<Student> students) {
        for (Student s : students) {
            if (s.countAvgScore() >= 3) {
                s.increaseCourse();
            }
        }
    }

    public static void searchByCourse(List<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}
