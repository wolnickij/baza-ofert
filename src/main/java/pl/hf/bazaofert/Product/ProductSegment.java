package pl.hf.bazaofert.Product;

public enum ProductSegment {
    DISTRICT_HEATING("Cieplownictwo"),
    GAS("Gaz"),
    CONSTRUCTION("Branża konstrukcyjna"),
    WATER("Wod-kan"),
    GEOTHERMAL("Geotermia");

    private String segmentName;

    ProductSegment(String segmentName) {
        this.segmentName = segmentName;
    }
}
