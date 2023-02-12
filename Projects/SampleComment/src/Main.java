import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // create an integer called firstNum
        // create an integer called secondNum
        // create a variable for sum
        int firstNum, secondNum, sum;

        // ask user for firstNum
        System.out.print("Enter first number: ");
        firstNum = input.nextInt();

        // ask user for secondNum
        System.out.print("Enter second number: ");
        secondNum = input.nextInt();

        // put firstNum + secondNum in sum
        sum = firstNum + secondNum;

        // tell user "answer is" sum
        System.out.println("The answer is: " + sum);

    }
}