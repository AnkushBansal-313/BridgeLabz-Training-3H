import java.util.Scanner;

public class CustomTrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();
        
        int[] indices = findTrimIndices(input);
        String customTrimmed = customSubstring(input, indices[0], indices[1]);
        String builtInTrimmed = input.trim();
        
        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);
        
        System.out.println("Original: '" + input + "'");
        System.out.println("Custom trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in trimmed: '" + builtInTrimmed + "'");
        System.out.println("Strings are equal: " + areEqual);
    }
    
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end};
    }
    
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}