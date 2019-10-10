import java.util.Scanner;

public class Opg5 {
    public static void displaySortedNumbers(double n1, double n2, double n3){
        //if the conditions are not met, then n1 will remain as the value.
        double largest = n1;
        double middle = n1;
        double smallest = n1;
        //find largest
        if (n2 > n1 && n2 > n3)
            largest = n2;
        else if (n3 > n1 && n3 > n2)
            largest = n3;
        //find middle
        if (n2 > n1 && n2 < n3 || n2 < n1 && n2 > n3)
            middle = n2;
        else if (n3 > n1 && n3 < n2 || n3 < n1 && n3 > n2)
            middle = n3;
        //find smallest
        if (n2 < n1 && n2 < n3)
            smallest = n2;
        else if (n3 < n1 && n3 < n2)
            smallest = n3;

        System.out.println("largest= "+largest+" middle= "+middle+" smallest= "+smallest);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 3 numbers of type double");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        displaySortedNumbers(n1,n2,n3);
    }
}
