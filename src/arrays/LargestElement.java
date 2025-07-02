package arrays;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();


        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int largest = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);

        sc.close();
    }
}
