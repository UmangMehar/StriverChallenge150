package basicmaths;

public class CountDigits {
        public static void main(String[] args) {
            int n = 14;
            int count = 0;

            int temp = n;
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }

            System.out.println("Number of digits in " + n + " is: " + count);
        }
    }


