public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {42, 5623, -1, 352, 2, 6, -123};
        insertionSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void insertionSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

}