import java.util.Scanner;

public class Opg3 {
    public static int revers(int number){
        int result = 0;
        //eg: 123
        while (number!=0){
            //0*10=0 -> 3*10=30 -> 32*10=320 -> 321
            result*=10;
            //see below comment to see how modulus is added
            result+=number%10;
            //123/10=12 -> 12/10=2 2/10=0 and so ends the loop
            number/=10;
        }
        return result;
    }

    public static boolean isPalindrome(int number){
        if (number==revers(number))
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        System.out.println("Is the number palindrome? "+isPalindrome(n));
    }
}
