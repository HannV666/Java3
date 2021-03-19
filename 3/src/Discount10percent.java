public class Discount10percent extends Product {
    public Discount10percent(String name, double price, double rating) {
        super(name, price, rating);
    }
    @Override
    public void showDiscount(){
        System.out.println("Your discount 10%");
        System.out.println("Total price: " + (getPrice() - (getPrice() * 0.1)));
    }
}
