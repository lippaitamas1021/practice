package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client c = new Client("LT", 1984, "NY");

        System.out.println("Ügyfél neve: " + c.getName() + ", születési éve: " + c.getYear() + ", lakcíme: " + c.getAddress());

    }
}
