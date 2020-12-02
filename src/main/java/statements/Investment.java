package statements;

public class Investment {

    private int amount;
    private double cost = 0.3;
    private int interestRate;
    private boolean active = true;

    public Investment(int amount, int interestRate) {
        this.amount = amount;
        this.interestRate = interestRate;;
    }

    public int getAmount() {
        return amount;
    }

    public double getYield(int days) {
        return (amount * interestRate * days) / (100.0 * 365);
    }

    public double close(int days) {
        double totalAmount = getAmount() + getYield(days) + (1 - cost /100);
        double payout = active ? totalAmount : 0;
        active = false;
        return payout;
    }
}
