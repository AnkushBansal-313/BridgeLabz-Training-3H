import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char[] uniqueChars = findUniqueCharacters(input);
        
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
    
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    
    public static char[] findUniqueCharacters(String str) {
        int length = findLength(str);
        char[] temp = new char[length];
        int uniqueCount = 0;
        
        for (int i = 0; i < length; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == current) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }
        
        char[] result = new char[uniqueCount];
        System.arraycopy(temp, 0, result, 0, uniqueCount);
        return result;
    }
}