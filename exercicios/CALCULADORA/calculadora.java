import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        String continuar;
        do{
            System.out.println("CALCULADORA");
            System.out.println("-------------");

            System.out.println("Operações");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");

            System.out.print("Qual tipo de operação deseja reaizar(Digite o numero correspondente):");
            byte operacao = scanner.nextByte();

            scanner.nextLine();


            switch (operacao) {
                case 1:
                    Soma soma = new Soma();
                    soma.Soma();
                    break;
                case 2:
                    Subtracao subtracao = new Subtracao();
                    subtracao.Subtracao();
                    break;
                case 3:
                    Divisao divisao = new Divisao();
                    divisao.Divisao();
                    break;
                case 4:
                    Multiplicacao multiplicacao = new Multiplicacao();
                    multiplicacao.Multiplicacao();
                    break;
                default:
                    System.out.println("Escolha invalida");
                    break;
            }

            System.out.print("\nDeseja fazer outra operação(S/N)?");
            continuar = scanner.nextLine();
        }while (continuar.equalsIgnoreCase("S"));
    }
}
