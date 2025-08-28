import java.util.Scanner;

public class MusicPlaylistManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] songs = {"Song1", "Song2", "Song3"};
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- Music Playlist Menu ---");
            System.out.println("1. Play all songs");
            System.out.println("2. Play song by index");
            System.out.println("3. Search song by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Playing all songs:");
                    for (int i = 0; i < songs.length; i++) {
                        System.out.println((i + 1) + ". " + songs[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter song index (1 to " + songs.length + "): ");
                    int index = sc.nextInt();
                    if (index >= 1 && index <= songs.length) {
                        System.out.println("Playing: " + songs[index - 1]);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 3:
                    System.out.print("Enter song name to search: ");
                    String name = sc.next();
                    boolean found = false;
                    for (String song : songs) {
                        if (song.equalsIgnoreCase(name)) {
                            System.out.println("Found and Playing: " + song);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Song not found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Music Player...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
