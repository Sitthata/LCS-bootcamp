import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correct = "LCS";
        boolean keepGoing = true;
        int tries = 0;

        while(keepGoing){
            tries++;
            System.out.println("You have try: " + tries + " times");
            System.out.println("What is the password?");
            String guess = sc.nextLine();

            if(guess.equals(correct)){
                System.out.println("Correct!");
                keepGoing = false;
            } else if (tries >= 3) {
                System.out.println("Launching Nuke");
                keepGoing = false;
            }
        }


    }
}