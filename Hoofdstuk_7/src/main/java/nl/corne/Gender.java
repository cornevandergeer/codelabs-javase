package nl.corne;

public enum Gender {
    MALE("man"), FEMALE("vrouw"), UNKNOWN("onbekend");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}

