public class MergeSort {
    public static void main(String[] args) {
        int[] array = {34, 25, -1, 2523, 0, 9250, 1};
        mergeSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void mergeSort(int[] array) {
        int len = array.length;
        if (len == 1) return;
        int mid = len / 2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[len - mid];
        for (int i = 0; i < len; i++) {
            if (i < mid) arr1[i] = array[i];
            else arr2[i - mid] = array[i];
        }
        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr1, arr2, array);
    }

    private static void merge(int[] arr1, int[] arr2, int[] array) {
        int i = 0, l = 0, r = 0, lenL = arr1.length, lenR = arr2.length;
        while (l < lenL && r < lenR) {
            if (arr1[l] < arr2[r]) {
                array[i] = arr1[l];
                i++;
                l++;
            } else {
                array[i] = arr2[r];
                i++;
                r++;
            }
        }
        while (l < lenL) {
            array[i] = arr1[l];
            i++;
            l++;
        }
        while (r < lenR) {
            array[i] = arr2[r];
            i++;
            r++;
        }
    }

}