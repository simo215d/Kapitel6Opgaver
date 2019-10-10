import java.util.Scanner;

public class Opg7 {
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount*(Math.pow((1+monthlyInterestRate),years*12));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.println("Years  Future value");
        for (int i = 1; i <= 30; i++) {
            System.out.printf("%-10s%-1.2f\n",i,futureInvestmentValue(investmentAmount, annualInterestRate/12,i));
        }
    }
}
