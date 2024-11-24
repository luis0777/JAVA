package ExemplosControlesLoops;

public class ControlandoLoopsContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i > 50 && i < 60) {
                System.out.println(">>" + i + "<<");
                continue;
            }
            System.out.println(i);
        }
    }
}


