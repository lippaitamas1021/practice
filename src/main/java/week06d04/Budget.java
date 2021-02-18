package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<Item> goods;

    public Budget(List<Item> goods) {
        this.goods = new ArrayList<>(goods);
    }

    public List<Item> getItemsByMonth(int month) {
        List<Item> result = new ArrayList<>();
        for (Item item : goods) {
            if (item.getMonth() == month) {
                result.add(item);
            }
        }
        return result;
    }
}
