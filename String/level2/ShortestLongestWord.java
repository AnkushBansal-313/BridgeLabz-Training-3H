import java.util.Scanner;

public class ShortestLongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        String[][] wordsWithLengths = getWordsWithLengths(text);
        int[] indices = findShortestLongest(wordsWithLengths);
        
        if (indices[0] != -1 && indices[1] != -1) {
            System.out.println("Shortest word: '" + wordsWithLengths[indices[0]][0] + 
                             "' (Length: " + wordsWithLengths[indices[0]][1] + ")");
            System.out.println("Longest word: '" + wordsWithLengths[indices[1]][0] + 
                            "' (Length: " + wordsWithLengths[indices[1]][1] + ")");
        } else {
            System.out.println("No words found in the text.");
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
    
    public static int[] findShortestLongest(String[][] wordsWithLengths) {
        if (wordsWithLengths.length == 0) {
            return new int[]{-1, -1};
        }
        
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordsWithLengths[0][1]);
        int longestLength = Integer.parseInt(wordsWithLengths[0][1]);
        
        for (int i = 1; i < wordsWithLengths.length; i++) {
            int currentLength = Integer.parseInt(wordsWithLengths[i][1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }
        
        return new int[]{shortestIndex, longestIndex};
    }
}