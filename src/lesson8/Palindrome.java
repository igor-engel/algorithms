package lesson8;

public class Palindrome {
    public static void main(String[] args) {
        String text = "Аргентина манит негра!";
        System.out.println("Строка является палиндромом = " + isPalindrome(text));
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            char leftCharacter = text.charAt(left);
            char rightCharacter = text.charAt(right);

            while (!Character.isLetter(leftCharacter)) {
                left++;
                leftCharacter = text.charAt(left);

                if (left == text.length() - 1) {
                    return true;
                }
            }

            while (!Character.isLetter(rightCharacter)) {
                right--;
                rightCharacter = text.charAt(right);
            }

            if (Character.toLowerCase(leftCharacter) != Character.toLowerCase(rightCharacter)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
