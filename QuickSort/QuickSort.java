public class QuickSort {
    public static void main(String[] args) {
        int[] array = {24, -14, 2, 2525, 5, 1, 36, 7};
        quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end - start <= 1) return;
        int i = start - 1, temp;
        while (start != end) {
            if (array[start] < array[end]) {
                i++;
                temp = array[start];
                array[start] = array[i];
                array[i] = temp;
            }
            start++;
        }
        i++;
        temp = array[end];
        array[end] = array[i];
        array[i] = temp;
        int end1 = i - 1;
        int start2 = i + 1;
        quickSort(array, 0, end1);
        quickSort(array, start2, end);
    }

}