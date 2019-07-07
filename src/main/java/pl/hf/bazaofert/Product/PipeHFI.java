package pl.hf.bazaofert.Product;

import lombok.Data;

@Data
public class PipeHFI extends Product implements Measurable {

    private ProductType productType;
    private float diameter;
    private float wallThickness;
    private String grade;
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
