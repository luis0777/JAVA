package ExemplosControlesLoops;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Numero ==> " + i);
            i = i + 1; // i++
        } while (i < 10);
    }
}
