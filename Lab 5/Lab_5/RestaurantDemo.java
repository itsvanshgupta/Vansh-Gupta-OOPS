package Upes.Lab_5;

public class RestaurantDemo {
    public static void main(String[] args) {
        Chef[] chefs = { new ItalianChef(), new ChineseChef(), new MexicanChef() };

        for (Chef chef : chefs) {
            chef.makeSpecialDish();
        }
    }
}
