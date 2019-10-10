public class Opg12 {
    public static void printNumbers(int n1, int n2, int numberPerLine){
        int lineCount = 0;
        for (n1+=1; n1 < n2; n1++) {
            System.out.print(n1+" ");
            lineCount++;
            if (lineCount==numberPerLine) {
                System.out.println();
                lineCount=0;
            }
        }
    }

    public static void main(String[] args) {
        printNumbers(0,101,10);
    }
}
