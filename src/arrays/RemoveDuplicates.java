package arrays;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the sorted array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements (with duplicates):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = removeDuplicates(arr);

        System.out.println("The array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
    static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
