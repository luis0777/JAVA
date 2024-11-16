import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resposta;
        do {
            System.out.println("MÉDIA DOS VALORES");

            float[] numeros = new float[3];

            System.out.print("1º numero: ");
            numeros[0] = scanner.nextFloat();
            System.out.print("2º numero: ");
            numeros[1] = scanner.nextFloat();
            System.out.print("3º numero: ");
            numeros[2] = scanner.nextFloat();

            scanner.nextLine();

            float media = (numeros[0] + numeros[1] + numeros[2]) / numeros.length;

            System.out.print("A média dos valores " + numeros[0] + " - " + numeros[1] + " - " + numeros[2] + " é igual a " + media);

            System.out.print("\nDeseja fazer novamente? S/N");
            resposta = scanner.nextLine();
        }while(resposta.equalsIgnoreCase("s"));
        System.out.print("PROGRAMA ENCERRADO");
        scanner.close();
    }
}
