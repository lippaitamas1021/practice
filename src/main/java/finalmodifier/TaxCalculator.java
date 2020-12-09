package finalmodifier;

public class TaxCalculator {

    public static final int VAT_HUN = 27;

    public double tax(double price) {
        return price * 0.27;
    }

    public double priceWithTax(double price) {
        return price * 1.27;
    }

    public static void main(String[] args) {
        TaxCalculator tc = new TaxCalculator();
        System.out.println(tc.tax(100));
        System.out.println(tc.priceWithTax(100));
    }
}
