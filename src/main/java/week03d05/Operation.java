package week03d05;

public class Operation {

    private int leftOperand;
    private int rightOperand;

    public Operation(int leftOperand, int rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public int getResult(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }

    public static void main(String[] args) {
        Operation operation = new Operation(68, 12);
        System.out.println(operation.getResult(operation.leftOperand, operation.rightOperand));

    }
}
