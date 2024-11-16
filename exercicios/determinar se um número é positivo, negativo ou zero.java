import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String resposta;
       do {
           System.out.print("\nPOSITIVO, NEGATIVO OU ZERO\n");

           System.out.print("Digite um numero: ");
           float number = scanner.nextFloat();

           scanner.nextLine();

           if (number > 0) {
               System.out.print("O numero " + number + " é POSITIVO");
           } else if (number < 0) {
               System.out.print("O numero " + number + " é NEGATIVO");
           } else {
               System.out.print("O numero " + number + " é igual a ZERO");
           }

           System.out.print("\nDeseja inserir outro numero? S/N");
           resposta = scanner.nextLine();
       }while(resposta.equalsIgnoreCase("s"));

       System.out.print("PROGRAMA ENCERRADO.");
       scanner.close();
    }
}
