package brainacad_org;

public class StringUtils {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        int length = cleanedStr.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static int countVowels(String str) {
        if (str == null) {
            return 0;
        }

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }

    public static int countConsonants(String str) {
        if (str == null) {
            return 0;
        }

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
                count++;
            }
        }

        return count;
    }

    public static int countWordOccurrences(String text, String word) {
        if (text == null || word == null || word.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+");
        int count = 0;

        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }

        return count;
    }
}
