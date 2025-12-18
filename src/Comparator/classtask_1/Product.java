package Comparator.classtask_1;

public class Product {
    String name;
    int price;
    int popularity;

    public Product(String name, int price, int popularity) {
        this.name = name;
        this.price = price;
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", popularity=" + popularity +
                '}';
    }
}