package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> goods;

    public Store(List<Product> goods) {
        this.goods = new ArrayList<>(goods);
    }

    public int getProductByCategoryName(String category) {
        int counter = 0;
        for (int i = 0; i < goods.size(); i++) {
            if (goods.get(i).getCategory().equals(category)) {
                counter++;
            }
        }
        return counter;
    }
}
