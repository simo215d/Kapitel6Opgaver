public class Opg13 {
    public static void sum(int i){
        System.out.printf("%-15s%-15s\n","i","m(i)");
        System.out.print("-------------------\n");
        double sum = 0;
        for (double j = 1; j <= i; j++) {
            sum += j/(j+2);
            System.out.printf("%-15d%-15.4f\n",(int)j,sum);
        }
    }

    public static void main(String[] args) {
        sum(20);
    }
}
