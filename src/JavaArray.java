import java.util.Arrays;
import java.util.Scanner;

public class JavaArray {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.printf("Sorted array: %s", Arrays.toString(arr));
    }
}