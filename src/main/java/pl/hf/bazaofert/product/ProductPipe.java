package pl.hf.bazaofert.product;

import lombok.Data;
import pl.hf.bazaofert.offer.OfferPosition;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class ProductPipe extends Product implements Weightable {
    @Id
    @GeneratedValue
    Long id;
    private ProductType productType;
    private float diameter;
    private float wallThickness;
    @ManyToOne
    private SteelGrade grade;
    private float length;
    private int lengthToleranceMinus;
    private int lengthTolerancePlus;
    @OneToMany(fetch= FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="pipe")
    List<OfferPosition> offerPositions;

    @Override
    public float getWeight() {
        float diameter = this.diameter;
        float wallThickness = this.wallThickness;
        return Math.round((((diameter - wallThickness) * wallThickness * 0.0246615) * 100)) / 100;
    }
}


