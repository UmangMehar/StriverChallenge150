package basicmaths;

public class CheckPalindrome {

        public static void main(String[] args) {
            int n = 121;
            int original = n;
            int reversed = 0;

            while (n > 0) {
                int digit = n % 10;
                reversed = reversed * 10 + digit;
                n = n / 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a palindrome");
            } else {
                System.out.println(original + " is not a palindrome");
            }
        }
    }

