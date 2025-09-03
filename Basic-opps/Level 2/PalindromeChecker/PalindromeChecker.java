package Basic-opps.Level 2.PalindromeChecker;

public class PalindromeChecker {
    String text;
    PalindromeChecker(String text) {
        this.text = text;
    }
    
    boolean isPalindrome() {
        String clean = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                clean += Character.toLowerCase(c);
            }
        }
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}