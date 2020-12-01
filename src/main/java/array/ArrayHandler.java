package array;

public class ArrayHandler {

    public boolean contains(int[] source, int itemToFind) {
        for (int item : source) {
            if (item == itemToFind) {
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        int[] sourceTest = {1, 2, 3, 4, 5};
        System.out.println(arrayHandler.contains(sourceTest, 3));
        System.out.println(arrayHandler.find(sourceTest, 5));
    }
}
