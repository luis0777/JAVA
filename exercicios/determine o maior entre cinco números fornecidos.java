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
            System.out.print("Terceiro numero: ");
            float number3 = scanner.nextFloat();
            System.out.print("Quarto numero: ");
            float number4 = scanner.nextFloat();
            System.out.print("Quinto numero: ");
            float number5 = scanner.nextFloat();

            // Identificar o maior número entre os cinco
            float maior = number1; // Assumimos inicialmente que o primeiro é o maior

            if (number2 > maior) {
                maior = number2;
            }
            if (number3 > maior) {
                maior = number3;
            }
            if (number4 > maior) {
                maior = number4;
            }
            if (number5 > maior) {
                maior = number5;
            }

            System.out.println("O maior número é: " + maior);

          
            scanner.nextLine(); 
            System.out.print("Deseja fazer novamente? S/N: ");
            resposta = scanner.nextLine();
        } while (resposta.equalsIgnoreCase("s"));

        System.out.println("PROGRAMA ENCERRADO");
        scanner.close();
    }
}
