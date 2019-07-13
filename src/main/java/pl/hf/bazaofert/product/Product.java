package pl.hf.bazaofert.product;

import lombok.Data;

@Data
public abstract class Product {
    protected ProductSegment productSegment;
    protected ProductType productType;
    protected String productName;
}
