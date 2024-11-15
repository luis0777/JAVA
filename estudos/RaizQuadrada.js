import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        double numero = scanner.nextDouble();

        double raiz = Math.sqrt(numero);

        System.out.println("A raiz quadrada de "  + numero + " é " + raiz);
        scanner.close();

        }
    }
