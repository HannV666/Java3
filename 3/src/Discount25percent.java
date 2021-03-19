public class Discount25percent extends Product {
    public Discount25percent(String name, double price, double rating) {
        super(name, price, rating);
    }
    @Override
    public void showDiscount(){
        System.out.println("Your discount 25%");
        System.out.println("Total price: " + (getPrice() - (getPrice() * 0.25)));
    }
}
