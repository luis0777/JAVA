import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resposta;
        do {
            System.out.println("FASES DA VIDA");
            System.out.print("Digite sua idade: ");
            byte idade = scanner.nextByte();

            scanner.nextLine();

            if (idade <= 10) {
                System.out.print("Você é criança pois tem " + idade + " anos");
            } else if (idade <= 18) {
                System.out.print("Você é adolescente pois tem " + idade + " anos");
            } else if (idade <= 60) {
                System.out.print("Você é adulto pois tem " + idade + " anos");
            } else {
                System.out.print("Você é idoso pois tem " + idade + " anos");
            }
            System.out.print("\nDeseja refazer? S/N");
            resposta = scanner.nextLine();
        }while (resposta.equalsIgnoreCase("s"));
        System.out.print("PROGRAMA ENCERRADO");
        scanner.close();
    }
}
