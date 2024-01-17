import Controlles.ShoppingCart;
import Product_groups.Alcohol;
import Product_groups.Food;
import Product_groups.Medicine;

public class Main {
    public static void main(String[] args) {
Food bread = new Food ("Vilniaus ", 1, 20);
        Medicine panadol = new Medicine ("Panadol ", 5.59, 10);
        Alcohol likeris = new Alcohol("Bosca", 15.0, 0);

        ShoppingCart myShoppingCart = new ShoppingCart();
        myShoppingCart.addItem(bread);
      myShoppingCart.addItem(panadol);
       myShoppingCart.addItem(likeris);

        System.out.println(myShoppingCart.getTotalPrice() + "EUR");
        System.out.println(myShoppingCart.getTotalPriceWithVat() + " Eur + VAT");
        System.out.println(myShoppingCart.getPriceInUSD(1.06) + " USD");
    }

}
