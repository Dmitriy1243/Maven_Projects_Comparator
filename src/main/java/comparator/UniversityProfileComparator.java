package comparator;

import uis.University;
import org.apache.commons.lang3.StringUtils;

public class UniversityProfileComparator implements UniversityComparator {

    @Override
    public int compare(University p1, University p2) {
        if (null == p1.getMainProfile()) {
            return 1;
        } else if (null == p2.getMainProfile()) {
            return -1;
        }
        return StringUtils.compare(p1.getMainProfile().name(), p2.getMainProfile().name());
    }
}
