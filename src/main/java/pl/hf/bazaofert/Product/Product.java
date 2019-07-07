package pl.hf.bazaofert.Product;

import lombok.Data;

@Data
public abstract class Product {
    protected ProductSegment productSegment;
    protected ProductType productType;
    protected String productName;
    protected float price;
}
