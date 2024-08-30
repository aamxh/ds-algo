public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {234, -24, -25, 24152, 2, 535, 25, 7};
        selectionSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {
        int min, temp, idx = 0;
        for (int i = 0; i < array.length - 1; i++) {
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    idx = j;
                }
            }
            if (min != array[i]) {
                temp = array[i];
                array[i] = min;
                array[idx] = temp;
            }
        }
    }

}