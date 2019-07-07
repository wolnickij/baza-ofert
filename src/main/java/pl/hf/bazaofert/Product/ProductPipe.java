package pl.hf.bazaofert.Product;

import lombok.Data;

@Data
public abstract class ProductPipe extends Product implements Weightable {
    private float diameter;
    private float wallThickness;
    private SteelGrade grade;
    private float length;
    private int lengthToleranceMinus;
    private int lengthTolerancePlus;

    @Override
    public float getWeight() {
        float diameter = this.diameter;
        float wallThickness = this.wallThickness;
        float weight = Math.round((((diameter - wallThickness) * wallThickness * 0.0246615) * 100)) / 100;
        return weight;
    }
}


