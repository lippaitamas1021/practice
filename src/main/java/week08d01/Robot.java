package week08d01;

public class Robot {

    private static final String POSITIONS = "FLJB";
    private Position position = new Position(0,0);

    public Position getPosition() {
        return position;
    }

    public void move(String movement) {
        String[] temp = movement.split("");
        for (String s : temp) {
            if (!POSITIONS.contains(s)) {
                throw new IllegalArgumentException("Wrong parameter");
            }
            if (s == "F") {
                getPosition().setY(getPosition().getY() + 1);
            }
            if (s == "L") {
                getPosition().setY(getPosition().getY() - 1);
            }
            if (s == "J") {
               getPosition().setX(getPosition().getX() + 1);
            }
            if (s == "B") {
              getPosition().setX(getPosition().getX() - 1);
            }
        }
    }

}
