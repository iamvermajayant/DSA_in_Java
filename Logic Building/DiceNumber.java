import java.util.Scanner;

public class DiceNumber{
    public static void main(String[] args){
        System.out.println("Enter the first number");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        if(number1 == 6){
            System.out.println("The opposite face is 1");
        }
        else if(number1 == 5){
            System.out.println("The opposite face is 2");
        }
        else if(number1 == 4){
            System.out.println("The opposite face is 3");
        }
        else if(number1 == 3){
            System.out.println("The opposite face is 4");
        }
        else if(number1 == 2){
            System.out.println("The opposite face is 5");
        }
        else if(number1 == 1){
            System.out.println("The opposite face is 6");
        }
        else{
            System.out.println("Invalid number");
        }
    }
}