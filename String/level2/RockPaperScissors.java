import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = scanner.nextInt();
        scanner.nextLine();
        
        String[][] results = new String[games][4];
        int playerWins = 0;
        int computerWins = 0;
        
        for (int i = 0; i < games; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String playerChoice = scanner.nextLine().toLowerCase();
            
            String computerChoice = getComputerChoice();
            String winner = determineWinner(playerChoice, computerChoice);
            
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
            
            results[i][0] = String.valueOf(i + 1);
            results[i][1] = playerChoice;
            results[i][2] = computerChoice;
            results[i][3] = winner;
        }
        
        String[][] stats = calculateStats(playerWins, computerWins, games);
        displayResults(results, stats);
    }
    
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int randomIndex = (int)(Math.random() * 3);
        return choices[randomIndex];
    }
    
    public static String determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Draw";
        }
        
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return "Player";
        }
        
        return "Computer";
    }
    
    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        int draws = totalGames - playerWins - computerWins;
        
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.1f%%", (playerWins * 100.0 / totalGames));
        
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.1f%%", (computerWins * 100.0 / totalGames));
        
        return stats;
    }
    
    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tPlayer\tComputer\tWinner");
        System.out.println("----------------------------------------");
        for (String[] result : results) {
            System.out.println(result[0] + "\t" + result[1] + "\t" + result[2] + "\t\t" + result[3]);
        }
        
        System.out.println("\nStatistics:");
        System.out.println("Player\tWins\tWin Percentage");
        System.out.println("-----------------------------");
        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t" + stat[1] + "\t" + stat[2]);
        }
    }
}