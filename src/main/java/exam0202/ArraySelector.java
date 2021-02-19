package exam0202;

public class ArraySelector {

    public String selectEvens(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        if (numbers.length == 0) {
            return "";
        }
        if (numbers.length == 1) {
            return String.valueOf(stringBuilder.append("[" + numbers[0] + "]"));
        }
        if (numbers.length == 2) {
            return String.valueOf(stringBuilder.append("[" + numbers[0] + "]"));
        }
        stringBuilder.append("[");
        for (int i = 0; i < numbers.length; i = i + 2) {
            stringBuilder.append(numbers[i] + ", ");
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

