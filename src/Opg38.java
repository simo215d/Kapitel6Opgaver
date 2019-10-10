public class Opg38 {
    public static char getRandomCharacter(char c1, char c2){
        return (char)(c1+Math.random()*(c2-c1+1));
    }

    public static char randomUpperChar(){
        return getRandomCharacter('A','Z');
    }

    public static char randomDigitChar(){
        return getRandomCharacter('0','9');
    }

    public static void main(String[] args) {
        System.out.println("200 uppercase letters");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(randomUpperChar()+" ");
            }
            System.out.println();
        }
        System.out.println("200 single digits");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(randomDigitChar()+" ");
            }
            System.out.println();
        }
    }
}
