package lesson8;

public class MaxSubstring {
    public static void main(String[] args) {
        String text = "дддппппггыаззЗзз";

        int textMaxSubstringLength = getMaxSubstringLength(text);
        System.out.print("Максимальная длина подстроки = " + textMaxSubstringLength + " символов.");
    }

    public static int getMaxSubstringLength(String text) {
        if (text.length() == 0) {
            return 0;
        }

        text = text.toLowerCase();

        int maxSubstringLength = 1;
        int currentSubstringLength = 1;

        for (int i = 1; i < text.length(); ++i) {
            if (text.charAt(i - 1) == text.charAt(i)) {
                currentSubstringLength++;

                if (maxSubstringLength < currentSubstringLength) {
                    maxSubstringLength = currentSubstringLength;
                }
            } else {
                currentSubstringLength = 1;
            }
        }

        return maxSubstringLength;
    }
}
