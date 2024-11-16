import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite numeros (0 para finalizar): ");
        while (true){
            int numero = scanner.nextInt();
            if(numero == 0){
                break;
            }
            numeros.add(numero);
        }

        Collections.sort(numeros);
        System.out.println("Numeros em ordem crecente: " + numeros);
    }
}
