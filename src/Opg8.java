public class Opg8 {
    public static double m2k(double miles){
        return miles*1.6;
    }

    public static double k2m(double kilometers){
        return kilometers/1.6;
    }

    public static void main(String[] args) {
        //15x% betyder at næste ,HER, fylder mellemrum ind indtil den er 15 lang
        System.out.printf("%-15s%-15s%-5s%-15s%-15s\n", "Miles", "Kilometers", "|", "Kilometers", "Miles");
        System.out.println("--------------------------------------------------------");
        for (int i = 1; i <= 3; i++) {
            System.out.printf("%-15d%-15.3f%-5s%-15d%-15.3f\n",i,m2k(i),"|",(15+(i*5)),k2m(20+(i*5)));
        }
    }
}
