import java.util.Scanner;

public class SwapTwoNumber{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");

        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");

        int secondNumber = scanner.nextInt();
        System.out.println("Before swapping: ");
        System.out.println("First number: " + firstNumber);

        System.out.println("Second number: " + secondNumber);

        int temp;

        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After swapping: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }
}