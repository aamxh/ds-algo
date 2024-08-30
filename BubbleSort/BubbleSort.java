public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {32, 2, -24, 0, 25, 5, 62};
        bubbleSort(array);
        for (int i: array) {
            System.out.println(i );
        }
    }

    private static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}