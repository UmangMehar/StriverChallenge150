package arrays;

public class LeftRotateByOne {
    public static void rotate(int[] arr) {
        int n = arr.length;
        int first = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = first;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
