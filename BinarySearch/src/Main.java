import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Util ob = new Util();
        int arr[] = {10, 20, 5, 61, 1};

        // Sort the array before performing binary search
        Arrays.sort(arr);

        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        int result = ob.binarySearch(arr, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }}}