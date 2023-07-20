package comparator;

import uis.University;

public class UniversityYearComparator implements UniversityComparator {

    @Override
    public int compare(University p1, University p2) {
        return Integer.compare(p1.getYearOfFoundation(), p2.getYearOfFoundation());
    }
}
