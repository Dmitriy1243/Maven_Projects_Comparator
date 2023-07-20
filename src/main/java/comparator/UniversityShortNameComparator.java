package comparator;

import uis.University;
import org.apache.commons.lang3.StringUtils;

public class UniversityShortNameComparator implements UniversityComparator {

    @Override
    public int compare(University p1, University p2) {
        return StringUtils.compare(p1.getShortName(), p2.getShortName());
    }
}
