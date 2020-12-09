package finalmodifier;

public class CircleCalculator {

    public static final double Pi = 3.14;

    public double calculatePerimeter(double r) {
        return 2 * r * Pi;
    }

    public double calculateArea(double r) {
        return r * r * Pi;
    }

    public static void main(String[] args) {
        CircleCalculator cc = new CircleCalculator();
        System.out.println(cc.calculatePerimeter(5.8));
        System.out.println(cc.calculateArea(5.8));
    }
}
