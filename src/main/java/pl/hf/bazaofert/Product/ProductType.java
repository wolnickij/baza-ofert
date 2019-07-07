package pl.hf.bazaofert.Product;

public enum ProductType {
    HFI("rura HFI", "HFI pipe", "83"),
    SAWH("rura SAWH", "SAWH pipe", "8S"),
    SAWL("rura SAWL", "SAWL pipe", "8W"),
    LPE("izolacja 3LPE", "3LPE coating","Izolacja"),
    LPP("izolacja 3LPP", "3LPP coating","Izolacja"),
    CEM("wewnętrzna powłoka cementowa","cement lining","Izolacja"),
    EPOXY("wewnętrzna powłoka epoksydowa","epoxy lining","Izolacja"),
    SLMS("rura SLMS", "SLMS pipe", "41");

    private String namePL;
    private String nameEN;
    private String productGroup;

    ProductType(String namePL, String nameEN, String productGroup) {
        this.namePL = namePL;
        this.nameEN = nameEN;
        this.productGroup = productGroup;
    }
}
