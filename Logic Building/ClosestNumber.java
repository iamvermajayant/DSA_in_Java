import java.util.Scanner;

public class ClosestNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int q = num1/num2;

        int firstNum = num2 * q;

        int secondNum = (num1 * num2) > 0 ? (num2 * (q + 1)) : (num2 * (q - 1));

        if(Math.abs(num1 - firstNum) < Math.abs(num1 - secondNum)){
            System.out.println("The closest number to " + num1 + " is: " + firstNum);
        } else {
            System.out.println("The closest number to " + num1 + " is: " + secondNum);
        }

    }
}