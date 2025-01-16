class PalindromeCheck {

    // Field (Attribute)
    private String text;

    // Constructor
    public PalindromeCheck(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = cleanedText.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create PalindromeCheck object
        PalindromeCheck checker = new PalindromeCheck("Anna");

        // Display the result
        checker.displayResult();
    }
}
