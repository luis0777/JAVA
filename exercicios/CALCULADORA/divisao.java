import java.util.Scanner;

public class Divisao {
    public void Divisao(){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite os dois numeros que deseja fazer a divisão");
        System.out.print("1º numero: ");
        float n1 = scanner.nextFloat();
        System.out.print("2º numero: ");
        float n2 = scanner.nextFloat();

        if (n1 == 0) {
            System.out.println("Não existe número divisível por zero");
        }else{
            float resultado = n1 / n2;

            System.out.print("A divisão dos numeros " + n1 + " e " + n2 + " é igual a " + resultado);
        }
    }
}
