import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        var nome = scanner.nextLine();

        System.out.println("Olá " + nome + ", esse é o sistema de notas que irá calcular sua média.");

        String resposta;
        do {
            System.out.print("Digite sua primeira nota: ");
            var nota1 = scanner.nextFloat();
            System.out.print("Digite sua segunda nota: ");
            var nota2 = scanner.nextFloat();

            // Limpa o buffer após a leitura dos floats
            scanner.nextLine(); // Adicionado para consumir o caractere de nova linha

            var media = (nota1 + nota2) / 2;

            if (media >= 7.0) {
                System.out.println(nome + " com essas notas sua média fica " + media + " e você está APROVADO");
            } else if (media <= 5) {
                System.out.println(nome + " com essas notas sua média fica " + media + " e você está REPROVADO");
            } else {
                System.out.println(nome + " com essas notas sua média fica " + media + " e você está de EXAME");
            }

            System.out.print("Deseja calcular outra média? S/N: ");
            resposta = scanner.nextLine();
        } while (resposta.equalsIgnoreCase("S")); // Corrigido para aceitar "S" ou "s"

        scanner.close();
    }
}
