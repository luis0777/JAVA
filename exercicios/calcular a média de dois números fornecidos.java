import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Média de dois numeros");

       System.out.print("\nDigite o primeiro numero: ");
       float number1 = scanner.nextFloat();
       System.out.print("Digite o segundo numero: ");
       float number2 = scanner.nextFloat();

       float media = (number1 + number2)/2;

       System.out.print("A media dos numeros " + number1 + " e " + number2 + " é igual a " + media);
       scanner.close();
    }
}
