import java.util.Scanner;

public class Opg2 {
    public static int sumDigits(long n){
        int result = 0;
        int mod = 0;
        int currentMod = 10;
        int countAssist = 1;
        //hver gang et loop er kørt så siger vi n-=mod, som vil give 0 når alle tal er kørt igennem
        while (n%currentMod!=0){
            //vi dividerer med 1 -> 10 -> 100, så vi fjerne 0'erne.
            //EG: 23. (23 mod 10)/1 = 3. -> 23-3=20 ->(20 mod 100)/10 -> 20-20 -> 0%currenmod = 0;
            result+=((n%currentMod)/countAssist);
            mod = (int)n%currentMod;
            currentMod*=10;
            n-=mod;
            countAssist*=10;
            System.out.println(mod);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        System.out.println(sumDigits(number));
    }
}
