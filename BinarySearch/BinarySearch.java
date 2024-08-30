public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int target = 10000;
        int result = binarySearch(array, target);
        if (result == -1){
            System.out.println("The element wasn't found.");
        } else {
            System.out.println("The element was found on index: " + String.valueOf(target));
        }
    }

    private static int binarySearch(int[] array, int target) {
        int start = 0, end = array.length - 1, mid;
        if (target > array[end] || target < array[start]) return -1;
        while(start <= end) {
            mid = start + (end - start) / 2;
            if (array[mid] > target) {
                end = mid--;
            } else if (array[mid] < target) {
                start = mid ++;
            } else {
                return mid;
            }
        }
        return -1;
    }

}