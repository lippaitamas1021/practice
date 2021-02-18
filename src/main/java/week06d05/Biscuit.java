package week06d05;

public class Biscuit {

    private BiscuitType type;
    private int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        if (type == null) {
            throw new IllegalArgumentException("Type must be filled");
        }
        this.type = type;
        if (gramAmount == 0) {
            throw new IllegalArgumentException("Weight can not be null");
        }
        this.gramAmount = gramAmount;
    }

    public BiscuitType getType() {
        return type;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public static Biscuit of(BiscuitType biscuitType, int gramAmount) {
        return new Biscuit(biscuitType,gramAmount);
    }

    @Override
    public String toString() {
        return "Biscuit{" +
                "type=" + type +
                ", gramAmount=" + gramAmount +
                '}';
    }

    public static void main(String[] args) {
        Biscuit biscuit = new Biscuit(BiscuitType.HIT, 150);
        System.out.println(biscuit);
        System.out.println(of(BiscuitType.OREO,200));
    }
}
