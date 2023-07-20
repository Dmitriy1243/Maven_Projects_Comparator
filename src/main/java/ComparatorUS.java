import comparator.*;
import enums.StudentComparatorEnums;
import enums.UniversityComparatorEnums;


public class ComparatorUS {

    private ComparatorUS() {
    }

    public static StudentComparator getStudentComparator(StudentComparatorEnums studentComparatorEnums) {

        switch (studentComparatorEnums) {

            case universityId:
                return new StudentUniversityIdComparator();
            case fullName:
                return new StudentFullNameComparator();
            case currentCourseNumber:
                return new StudentCourseComparator();
            case avgExamScore:
                return new StudentAvgExamScoreComparator();
            default:
                return new StudentFullNameComparator();
        }
    }

    public static UniversityComparator getUniversityComparator(UniversityComparatorEnums universityComparatorEnums) {

        switch (universityComparatorEnums) {

            case id:
                return new UniversityIdComparator();
            case fullName:
                return new UniversityFullNameComparator();
            case shortName:
                return new UniversityShortNameComparator();
            case mainProfile:
                return new UniversityProfileComparator();
            case yearOfFoundation:
                return new UniversityYearComparator();
            default:
                return new UniversityFullNameComparator();
        }
    }
}
