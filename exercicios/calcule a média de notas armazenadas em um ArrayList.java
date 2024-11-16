import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite as suas notas (0 para fianlizar): ");
        while (true){
            double nota = scanner.nextDouble();
            if(nota == 0){
                break;
            }
            notas.add(nota);
        }
        double soma = 0;
            for (double nota : notas){
                soma += nota;
            }
            double media = (notas.size() > 0)? soma / notas.size(): 0;
            System.out.println("A média das notas é: " + media);
    }
}
