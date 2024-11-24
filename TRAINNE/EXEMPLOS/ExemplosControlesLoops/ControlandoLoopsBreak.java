package ExemplosControlesLoops;

public class ControlandoLoopsBreak {
    public static void main(String[] args) {
        int x =1, y=15;
        for(int i = x; i < y; i++){
            if(i % 5 == 0){
                System.out.println("nr==> " + i);
                System.out.println("Achei um nr divisivel por 5 entre x e y");
                break;
            }
            System.out.println("nr " + i );
            // System.out.println("===========" );
        }
    }
}

