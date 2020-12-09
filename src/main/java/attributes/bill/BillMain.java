package attributes.bill;

public class BillMain {

    public static void main(String[] args) {

        Bill bill = new Bill();
        bill.addItem(new Item("Bread", 5, 1500.0));
        bill.addItem(new Item("Milk", 2, 500.0));
        bill.addItem(new Item("Sausage", 3, 2100.0));

        System.out.println(bill.calculateTotalPrice());

    }
}
