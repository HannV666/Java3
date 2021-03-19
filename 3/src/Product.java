/*
Создать класс Product, который имеет следующие поля: имя, цена, рейтинг.
Класс Product должен содержать метод для отображения скидки на продукт.
Создать 3 класса-наследника, в каждом из которых определить свою скидку.
Создать массив объектов Product, вызвать метод отображения скидки.
 */

public class Product {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public void showDiscount(){
        System.out.println("Your discount 40%");
        System.out.println("Total price: " + (price - (price * 0.4)));
    }

    public static void main(String[] args) {
        Product []product = new Product[4];
        product[0] = new Product("Product 1", 2.5, 8.2);
        product[1] = new Discount10percent("Product 2", 43.2, 7.9);
        product[2] = new Discount25percent("Product 3", 21.4, 5.3);
        product[3] = new Discount35percent("Product 4", 18.6, 8.4);
        for (int i = 0; i<4; i++) {
            System.out.println(product[i].name + "; rating: " + product[i].rating);
            product[i].showDiscount();
        }
    }
}
