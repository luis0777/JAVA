import java.util.Scanner;

public class Multiplicacao {
    public void Multiplicacao(){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite os dois numeros que deseja fazer a multiplicação");
        System.out.print("1º numero: ");
        float n1 = scanner.nextFloat();
        System.out.print("2º numero: ");
        float n2 = scanner.nextFloat();

        float resultado = n1 * n2;

        System.out.print("A multiplicação dos numeros " + n1 + " e " + n2 + " é igual a " + resultado);
    }
}
