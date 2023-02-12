import java.util.*;
public class RPGGame {
    public static void main(String[] args) {
        Player player = new Player("Player", 100, 10, 1);
        NPC goblin = new NPC("Goblin", 50, 10, 1);
        NPC dragon = new NPC("Dragon", 200, 100, 5);

        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.println("Choose an opponent to battle:");
        System.out.println("1. Goblin");
        System.out.println("2. Dragon");
        choice = input.nextInt();

        Character opponent;
        if (choice == 1) {
            opponent = goblin;
        } else {
            opponent = dragon;
        }

        while (player.isAlive() && opponent.isAlive()) {
            System.out.println(player.getName() + " has " + player.getHealth() + " health.");
            System.out.println(opponent.getName() + " has " + opponent.getHealth() + " health.");
            System.out.println("1. Attack");
            System.out.println("2. Drink Potion");
            System.out.println();
            choice = input.nextInt();

            if (choice == 1) {
                player.attack(opponent);
            } else if (choice == 2) {
                player.drinkPotion();
            }

            opponent.attack(player);
        }

        if (player.isAlive()) {
            System.out.println(player.getName() + " wins!");
        } else {
            System.out.println(opponent.getName() + " wins!");
        }
    }
}
