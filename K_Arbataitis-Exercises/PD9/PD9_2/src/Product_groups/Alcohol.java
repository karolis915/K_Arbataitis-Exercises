package Product_groups;

import Product_groups.AbstractProduct;

public class Alcohol extends AbstractProduct {

    private static final double VAT = 1.21;

    public Alcohol(String name, double price, double discount) {
        super(name, price, discount);
    }

    @Override
    public double getPriceWithVat() {
        return this.getPrice() * VAT;
    }

}
