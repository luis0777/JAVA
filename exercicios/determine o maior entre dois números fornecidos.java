import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String resposta;
        do {
            System.out.print("\n\nQUAL O NUMERO É MAIOR!!!\n");

            System.out.print("Primeiro numero: ");
            float number1 = scanner.nextFloat();
            System.out.print("Segundo numero: ");
            float number2 = scanner.nextFloat();

            scanner.nextLine();

            if (number1 > number2) {
                System.out.print(number1 + " é maior do que " + number2);
            } else if (number2 > number1) {
                System.out.println(number2 + " é maior do que " + number1);
            } else {
                System.out.println("Os numeros " + number1 + " e " + number2 + " são iguais");
            }

            System.out.print("Deseja fazer novamente? S/N");
            resposta = scanner.nextLine();
        }while (resposta.equalsIgnoreCase("s"));

        System.out.println("PROGRAMA ENCERRADO");
        scanner.close();
    }
}
