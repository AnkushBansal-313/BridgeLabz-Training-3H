import java.util.Scanner;

public class WordsWithLengths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        String[][] wordsWithLengths = getWordsWithLengths(text);
        
        System.out.println("Word\t\tLength");
        System.out.println("---------------------");
        for (String[] wordData : wordsWithLengths) {
            int length = Integer.parseInt(wordData[1]);
            System.out.println(wordData[0] + "\t\t" + length);
        }
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
    
    public static String[][] getWordsWithLengths(String text) {
        String[] words = customSplit(text);
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        
        return result;
    }
}