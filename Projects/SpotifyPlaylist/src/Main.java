import java.util.*;
public class Main {

    static List<String> playlist = new ArrayList<>();
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("\nSpotify To-Do List");
        System.out.println("1. Add a song");
        System.out.println("2. Remove a song");
        System.out.println("3. View playlist");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        option = sc.nextInt();
        sc.nextLine();
        while (option != 4) {
            switch (option) {
                case 1:
                    addSong();
                    break;
                case 2:
                    removeSong();
                    break;
                case 3:
                    viewPlaylist();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.println("\nSpotify To-Do List");
            System.out.println("1. Add a song");
            System.out.println("2. Remove a song");
            System.out.println("3. View playlist");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();
            sc.nextLine();
        }
    }

    static void addSong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter song name: ");
        String song = sc.nextLine();
        playlist.add(song);
        System.out.println(song + " added to playlist");
    }

    static void removeSong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter song name: ");
        String song = sc.nextLine();
        if (playlist.contains(song)) {
            playlist.remove(song);
            System.out.println(song + " removed from playlist");
        } else {
            System.out.println(song + " not found in playlist");
        }
    }

    static void viewPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty");
        } else {
            System.out.println("Songs in playlist:");
            for (String song : playlist) {
                System.out.println(song);
            }
        }
    }
}