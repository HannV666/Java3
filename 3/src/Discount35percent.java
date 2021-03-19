public class Discount35percent extends Product {
    public Discount35percent(String name, double price, double rating) {
        super(name, price, rating);
    }
    @Override
    public void showDiscount(){
        System.out.println("Your discount 35%");
        System.out.println("Total price: " + (getPrice() - (getPrice() * 0.35)));
    }
}
