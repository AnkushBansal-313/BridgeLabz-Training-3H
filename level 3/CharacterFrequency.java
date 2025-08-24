import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[][] freq = findCharacterFrequency(input);
        
        System.out.println("Character\tFrequency");
        System.out.println("---------------------");
        for (String[] row : freq) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
    
    public static String[][] findCharacterFrequency(String str) {
        int[] freq = new int[256];
        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) count++;
        }
        
        String[][] result = new String[count][2];
        int index = 0;
        
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char)i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        
        return result;
    }
}