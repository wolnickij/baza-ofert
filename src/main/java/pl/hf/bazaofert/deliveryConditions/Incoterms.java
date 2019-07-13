package pl.hf.bazaofert.deliveryConditions;

public enum Incoterms {
    FCA2010("FCA2010","FCA wg INCOTERMS 2010", "FCA in accordance with INCOTERMS2010"),
    FCA2000("FCA2000", "FCA wg INCOTERMS 2000", "FCA in accordance with INCOTERMS2000"),
    CPT2010("CPT2010","CPT wg INCOTERMS 2010", "CPT in accordance with INCOTERMS2010"),
    CPT2000("CPT2000","CPT wg INCOTERMS 2000", "CPT in accordance with INCOTERMS2000");

    private String IncotermsCode;
    private String IncotermsNamePL;
    private String IncotermsNameEN;

    Incoterms(String incotermsCode, String incotermsNamePL, String incotermsNameEN) {
        IncotermsCode = incotermsCode;
        IncotermsNamePL = incotermsNamePL;
        IncotermsNameEN = incotermsNameEN;
    }
}
