package arrays;

public class MoveZerosToEnd {
    public static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int index = 0; // Position to place next non-zero

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        pushZerosToEnd(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
