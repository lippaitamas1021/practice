package week09d03;

import java.util.Random;

public enum Present {
    TOY(1),ELECTRONIC(2),HOUSEKEEPING(3),DECORATION(4);

    private int value;

    Present(int value) {
        this.value = value;
    }

    public Present getValue(int number) {
        if (number == 1) {
            return Present.TOY;
        }
        if (number == 2) {
            return Present.ELECTRONIC;
        }
        if (number == 3) {
            return Present.HOUSEKEEPING;
        }
        if (number == 4) {
            return Present.DECORATION;
        }
        throw new IllegalArgumentException("Wrong parameter");
    }
}
