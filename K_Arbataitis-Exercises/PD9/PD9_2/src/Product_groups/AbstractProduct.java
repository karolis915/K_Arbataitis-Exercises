package Product_groups;

import Interfaces.DiscountItem;
import Interfaces.ProductItem;

public abstract class AbstractProduct implements ProductItem, DiscountItem {
    private String name;
    private double price;
    private double discount; // Percents

    public AbstractProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public AbstractProduct(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        if (this.discount == 0) {
            return price;
        } else {
            return getPriceWithDiscount(this.discount);
        }

    }


    @Override
    public double getPriceWithDiscount(double discount) {
    return price - price * (discount/ 100);
    }
}
