package classsctructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg a termék nevét:");
        String name = scanner.nextLine();

        System.out.println("Kérem, adja meg a termék árát:");
        int price = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(name, price);
        System.out.println("Termék neve: " + product.getName() + " , termék ára: " + product.getPrice());

        product.increasePrice(50);
        System.out.println(product.getPrice());

        product.decreasePrice(100);
        System.out.println(product.getPrice());
    }
}
