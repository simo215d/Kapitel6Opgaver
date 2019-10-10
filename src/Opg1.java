import java.util.Scanner;

public class Opg1 {
    public static int getPentagona(int n){
        int result = (n*(3*n-1))/2;
        return result;
    }

    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(getPentagona(count)+" ");
                count++;
            }
            System.out.println();
        }
    }
}
