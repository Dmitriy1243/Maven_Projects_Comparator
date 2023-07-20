package comparator;

import uis.Student;

public class StudentCourseComparator implements StudentComparator {

    @Override
    public int compare(Student p1, Student p2) {
        return Integer.compare(p1.getCurrentCourseNumber(), p2.getCurrentCourseNumber());
    }
}
