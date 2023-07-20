package comparator;

import uis.University;
import org.apache.commons.lang3.StringUtils;

public class UniversityIdComparator implements UniversityComparator {

    @Override
    public int compare(University p1, University p2) {
        return StringUtils.compare(p1.getId(), p2.getId());
    }
}
