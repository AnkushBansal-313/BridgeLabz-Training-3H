import java.util.Scanner;

public class StringSplitComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        String[] customSplit = customSplit(text);
        String[] builtInSplit = text.split(" ");
        
        boolean areEqual = compareArrays(customSplit, builtInSplit);
        
        System.out.println("Custom split result:");
        for (String word : customSplit) {
            System.out.println("'" + word + "'");
        }
        
        System.out.println("Built-in split result:");
        for (String word : builtInSplit) {
            System.out.println("'" + word + "'");
        }
        
        System.out.println("Arrays are equal: " + areEqual);
    }
    
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    
    public static String[] customSplit(String text) {
        if (text == null || text.isEmpty()) {
            return new String[0];
        }
        
        int wordCount = 0;
        boolean inWord = false;
        
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        
        String[] words = new String[wordCount];
        int wordIndex = 0;
        int start = 0;
        inWord = false;
        
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    start = i;
                    inWord = true;
                }
            } else {
                if (inWord) {
                    words[wordIndex] = extractWord(text, start, i - 1);
                    wordIndex++;
                    inWord = false;
                }
            }
        }
        
        if (inWord) {
            words[wordIndex] = extractWord(text, start, findLength(text) - 1);
        }
        
        return words;
    }
    
    private static String extractWord(String text, int start, int end) {
        StringBuilder word = new StringBuilder();
        for (int i = start; i <= end; i++) {
            word.append(text.charAt(i));
        }
        return word.toString();
    }
    
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        
        return true;
    }
}