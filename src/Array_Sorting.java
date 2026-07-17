import java.util.Scanner;
import java.util.Arrays;

public class Array_Sorting {

    public static void sortAscending(int[] arr) {
        Arrays.sort(arr);
    }

    public static void sortDescending(int[] arr) {
        Arrays.sort(arr);

        // Reverse the sorted array
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] originalArray = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }

        int[] ascArray = originalArray.clone();
        int[] descArray = originalArray.clone();

        sortAscending(ascArray);
        sortDescending(descArray);

        System.out.println("\n[+] Ascending Order: " + Arrays.toString(ascArray));
        System.out.println("[+] Descending Order: " + Arrays.toString(descArray));

        scanner.close();
    }
}