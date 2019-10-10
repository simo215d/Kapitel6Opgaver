import java.util.Scanner;

public class Opg4 {
    public static int reverse(int x){
        int result = 0;
        while (x!=0){
            result*=10;
            result+=x%10;
            x/=10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number that will be reversed:");
        int x = input.nextInt();
        System.out.println(x + " reversed = " + reverse(x));
    }
}
