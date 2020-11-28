package classsctructureconstructors;

public class StoreMain {

    public static void main(String[] args) {

        Store s1 = new Store("tej");
        Store s2 = new Store("kenyér");

        System.out.println("1. termék: " + s1.getProduct() + ", mennyiség: " + s1.getStock());
        System.out.println("2. termék: " + s2.getProduct() + ", mennyiség: " + s2.getStock());

        s1.store(5);
        s2.store(6);

        System.out.println("1. termék: " + s1.getProduct() + ", mennyiség: " + s1.getStock());
        System.out.println("2. termék: " + s2.getProduct() + ", mennyiség: " + s2.getStock());

        s1.dispatch(2);
        s2.dispatch(3);

        System.out.println("1. termék: " + s1.getProduct() + ", mennyiség: " + s1.getStock());
        System.out.println("2. termék: " + s2.getProduct() + ", mennyiség: " + s2.getStock());
    }
}
