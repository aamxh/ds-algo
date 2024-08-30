import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] input = {-23, -7, 0, 3, 28, 352, 1024, 1025, 2526, 256387, 10000000};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search for: ");
        int x = scanner.nextInt();
        int idx1 = 0, idx2 = input.length - 1, idx3;
        do {
            idx3 = Math.round((idx2 - idx1) / 2);
            if (input[idx3] == x) {
                System.out.println("The element is found on index: " + idx3);
                break;
            } else if (x > input[idx3]) {
                idx1 = idx3;
            } else if (x < input[idx3]) {
                idx2 = idx3;
            }
        } while(idx2 - idx1 <= 1);
        scanner.close();
    }
}