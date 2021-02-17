package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public int getNumberOfExpired(List<Product> productList) {
        int counter = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).isExpired()) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Store store = new Store();
        List<Product> goods = new ArrayList<>();
        goods.add(new Product("milk", 2021,2,15));
        goods.add(new Product("cream", 2021,3,1));
        goods.add(new Product("sour cream", 2021,1,16));
        goods.add(new Product("cottage cheese", 2021,4,18));
        System.out.println(store.getNumberOfExpired(goods));
    }
}
