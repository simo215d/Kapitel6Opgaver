public class Opg6 {

    public static void shit(int n){
        //loop laver så mange linjer som n er stor
        for (int i = 1; i <= n; i++) {
            //loop bruger linje nummer som indikation for hvor mange tal pr linje
            for(int count = 1; count <= i; count++){
                System.out.print(count);
            }
            System.out.println();
        }
        //printer sidste linje fra n og baglens
        for (int count = n; count>=1; count--){
            System.out.print(count);
        }
    }


    public static void main(String[] args) {
        shit(3);
    }
}
