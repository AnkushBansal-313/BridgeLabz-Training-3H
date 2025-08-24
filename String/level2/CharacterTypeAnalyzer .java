import java.util.Scanner;

public class CharacterTypeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[][] analysis = analyzeCharacters(input);
        displayAnalysis(analysis);
    }
    
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    
    public static String[][] analyzeCharacters(String str) {
        String[][] result = new String[str.length()][2];
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        
        return result;
    }
    
    public static void displayAnalysis(String[][] analysis) {
        System.out.println("Character\tType");
        System.out.println("-------------------");
        for (String[] row : analysis) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}