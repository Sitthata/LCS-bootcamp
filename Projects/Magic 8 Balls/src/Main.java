import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Magic 8 Balls

        // Ask a user of responses
        Scanner sc = new Scanner(System.in);

        System.out.println("Magic 8 ball program");
        System.out.println("Ask me something: ");
        String question = sc.nextLine();

        // Create random response
        int responseRandom = new Random().nextInt(5);

        // Create a variable that change the value via random
        String response;

        // Assign the response variable as String
        if (responseRandom == 0) {
            response = "Yes";
        } else if (responseRandom == 1) {
            response = "No";
        } else if (responseRandom == 2) {
            response = "Maybe";
        } else if (responseRandom == 3) {
            response = "Try again later";
        } else {
            response = "I'm not sure";
        }

        // say the response
        System.out.println("Magic 8 Ball says: " + response);


    }
}