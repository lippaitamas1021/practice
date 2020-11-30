package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {

        IntroControl introControl = new IntroControl();
        System.out.println(introControl.substractTenIfGreaterThanTen(9));
        System.out.println(introControl.describeNumber(1));
        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.calculateBonus(1500000));
        System.out.println(introControl.calculateConsumption(1256, 2316));

        System.out.println("printNumbers");
        introControl.printNumbers(6);

        System.out.println("printNumbersBetween");
        introControl.printNumbersBetween(5,11);

        System.out.println("printNumbersBetweenAnyDirection");
        introControl.printNumbersBetweenAnyDirection(5,1);

        System.out.println("printOddNumbers");
        introControl.printOddNumbers(9);
    }
}
