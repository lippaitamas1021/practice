package week02d03;

import java.util.Objects;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public boolean areTheyEqual(Product product2) {
        return equals(product2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Product product = new Product("milk", "1234");
        System.out.println(product.areTheyEqual(new Product("milk", "4567")));
    }
}
