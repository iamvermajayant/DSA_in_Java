import java.util.Scanner;

public class SumofNumber{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number");

        int number = scanner.nextInt();
        int sum = 0;

        for(int i=1; i<=number; i++){
            sum = sum + i;
        }

        System.out.println("The sum of the first " + number + " is " + sum);

    }
}