package comparator;

import uis.Student;

public class StudentAvgExamScoreComparator implements StudentComparator {

    @Override
    public int compare(Student p1, Student p2) {
        return Float.compare(p2.getAvgExamScore(), p1.getAvgExamScore());
    }
}
