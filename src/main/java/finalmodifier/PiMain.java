package finalmodifier;

public class PiMain {

    public static void main(String[] args) {
        CircleCalculator cc = new CircleCalculator();
        System.out.println(cc.calculatePerimeter(6.2));
        System.out.println(cc.calculateArea(6.2));

        CylinderCalculator cc2 = new CylinderCalculator();
        System.out.println(cc2.calculateSurfaceArea(6.2, 5.4));
        System.out.println(cc2.calculateVolume(6.2, 5.4));

        System.out.println(cc.Pi);
    }
}
