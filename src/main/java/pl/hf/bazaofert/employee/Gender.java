package pl.hf.bazaofert.employee;

public enum Gender {
    MALE("Pan", "Mr."),
    FEMALE("Pani", "Mrs.");

    private String titlePL;
    private String titleEN;

    Gender(String titlePL, String titleEN) {
        this.titlePL = titlePL;
        this.titleEN = titleEN;
    }
}
