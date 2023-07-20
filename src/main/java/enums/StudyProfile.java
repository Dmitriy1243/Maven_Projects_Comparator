package enums;

public enum StudyProfile {
    dispatcher("диспетчер"),
    constructor("конструктор"),
    engineer("инженер");

    private final String profileName;

    private StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}
