package pl.hf.bazaofert.Customer;

public enum Country {
    POLAND("Polska", "Poland", "PL"),
    GERMANY("Niemcy", "Germany", "DE"),
    AUSTRIA("Austria", "Austria", "AT"),
    CZECHIA("Czechy", "Czech Republic", "CZ"),
    SLOVAKIA("Słowacja", "Slovakia", "SK"),
    HUNGARY("Węgry", "Hungary", "HU"),
    FINLAND("Finlandia", "Finland", "FI"),
    SWEDEN("Finlandia", "Finland", "FI");

    private String countryNamePL;
    private String countryNameEN;
    private String countryCode;

    Country(String countryNamePL, String countryNameEN, String countryCode) {
        this.countryNamePL = countryNamePL;
        this.countryNameEN = countryNameEN;
        this.countryCode = countryCode;
    }
}
