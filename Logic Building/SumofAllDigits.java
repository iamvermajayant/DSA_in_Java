import java.util.Scanner;

// public class SumofAllDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
//         int sum = 0;
//         while (num != 0) {
//             int last = num % 10;
//             sum += last;
//             num /= 10;
//         }
//         System.out.println("Sum of all digits: " + sum);
//         sc.close();
//     }
// }

// public class SumofAllDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
//         int sum = sumOfDigits(num);
//         System.out.println("Sum of all digits: " + sum);
//         sc.close();
//     }

//     public static int sumOfDigits(int num) {
//         if (num == 0) {
//             return 0;
//         }
//         return num % 10 + sumOfDigits(num / 10);
//     }
// }

public class SumofAllDigits {
    static int SumofAllDigits(String s){
        int sum = 0;
        for(int i =0; i<s.length(); i++){
            int digit = s.charAt(i) - '0';
            sum += digit;
        }
        return sum;
    }

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = sc.next();
        System.out.println("Sum of all digits: " + SumofAllDigits(num));
        sc.close();
    }
}