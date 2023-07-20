package comparator;

import uis.Student;
import org.apache.commons.lang3.StringUtils;

public class StudentFullNameComparator implements StudentComparator {

    @Override
    public int compare(Student p1, Student p2) {
        return StringUtils.compare(p1.getFullName(), p2.getFullName());
    }
}
