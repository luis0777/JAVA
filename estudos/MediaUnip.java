import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE MEDIA - UNIP");

        String resposta;
        do{
            System.out.print("Qual média para você ser aprovado: ");
            float mediaAprovacao = scanner.nextFloat();
            System.out.print("Nota da NP1: ");
            float notaNP1 = scanner.nextFloat();
            System.out.print("Nota da NP2: ");
            float notaNP2 = scanner.nextFloat();
            System.out.print("Nota do PIM: ");
            float notaPIM = scanner.nextFloat();

            // Limpa o buffer após a leitura dos floats
            scanner.nextLine(); // Adicionado para consumir o caractere de nova linha

            float mediaSemestral = (notaNP1 * 2/5) + (notaNP2 * 2/5) + (notaPIM * 1/5);

            if(mediaSemestral >= mediaAprovacao){
                System.out.println("Média semestral " + mediaSemestral);
                System.out.println("SITUAÇÃO: APROVADO");
            }else {
                float notaExame = 10.00F - mediaSemestral;
                System.out.println("Média semestral " + mediaSemestral);
                System.out.println("SITUAÇÃO: VOCÊ ESTÁ DE EXAME E PRECISA TIRAR " + notaExame);
            }
            System.out.print("Deseja fazer outra média? S/N");
            resposta = scanner.nextLine();
        }while (resposta.equalsIgnoreCase("S"));
    }
}
