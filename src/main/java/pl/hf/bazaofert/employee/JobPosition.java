package pl.hf.bazaofert.employee;

public enum JobPosition {
    SALESMAN("Specjalista ds. Handlu", "Commercial specialist"),
    SENIOR_SALESMAN("Specjalista ds. Handlu", "Commercial specialist"),
    MANAGER("Kierownik Handlowy", "Commercial Manager"),
    STRATEGIC_CUSTOMER_DIRECTOR("Dyrektor ds. Klientów Strategicznych", "Strategic customer Director"),
    COMMERCIAL_DIRECTOR("Wiceprezes Zarządu. Dyrektor ds. Handlu", "VicePresident. Commercial Director"),
    CEO("Prezes Zarządu. Dyrektor Zakładu", "Plant Director. CEO"),
    CFO("Wiceprezes Zarządu. Dyrektor ds. Finansowych", "VicePresident of the Board. CFO");

    private final String jobTitlePL;
    private final String jobTitleEN;

    JobPosition(String jobTitlePL, String jobTitleEN) {
        this.jobTitlePL = jobTitlePL;
        this.jobTitleEN = jobTitleEN;
    }
}
