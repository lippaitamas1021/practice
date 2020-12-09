package introconstructors;

public class RestaurantMain {

    public static void main(String[] args) {

        Restaurant rst = new Restaurant("Winkler Étterem", 16);

        System.out.println(rst.getName() + ", " + rst.getCapacity() + " férőhely, Menü:" + rst.getMenu());

    }
}
