package pl.hf.bazaofert.offer;

public enum OfferStatus {
    IN_PREPARATION("W przygotowaniu"),
    IN_APPROVAL("Przekazana do zatwierdzenia"),
    APPROVED("Zatwierdzona"),
    SENT("Wysłana"),
    ACCEPTED("Przyjęta przez klienta");

    private String offerStatus;

    OfferStatus(String offerStatus) {
        this.offerStatus = offerStatus;
    }
}
