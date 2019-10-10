public class Opg14 {

    public static double summation(double i){
        double result = 0;
        int count = 0;
        for (int j = 1; j <= i; j++) {
            count++;
            if (j%2==0)
            result-=(Math.pow(-1,(j+1)))/(2*i-1);
            else result+=(Math.pow(-1,(j+1)))/(2*i-1);
        }
        System.out.println(count);
        return 4*(result);
    }

    public static void main(String[] args) {
        System.out.println(summation(1));
        System.out.println(summation(101));
    }
}
