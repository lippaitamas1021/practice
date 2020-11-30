package localvariables;

public class DistanceMain {
    public static void main(String[] args) {

        Distance distance = new Distance(500.25, true);

        System.out.println(distance.getD() + " " + distance.isE());

        int f = (int) distance.getD();
        System.out.println(f);
    }
}
