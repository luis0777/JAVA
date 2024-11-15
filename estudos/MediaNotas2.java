import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Seu nome: ");
        var nome = scanner.nextLine();

        System.out.print(nome + " qual a nota minima para você ser aprovado? ");
        float mediaAprovacao = scanner.nextFloat();

        System.out.print("Digite a nota de matématica:  ");
        float notaMatematica = scanner.nextFloat();

        System.out.print("Digite a nota de Fisica: ");
        float notaFisica = scanner.nextFloat();

        System.out.print("Digite a nota de Quimica: ");
        float notaQuimica = scanner.nextFloat();

        String situacaoMatematica;
        if(notaMatematica >= mediaAprovacao){
            situacaoMatematica = "Aprovado";
        } else {
            situacaoMatematica = "Reprovado";
        }

        String situacaoFisica;
        if(notaFisica >= mediaAprovacao){
            situacaoFisica = "Aprovado";
        } else {
            situacaoFisica = "Reprovado";
        }

        String situacaoQuimica;
        if(notaQuimica >= mediaAprovacao){
            situacaoQuimica = "Aprovado";
        } else {
            situacaoQuimica ="Reprovado";
        }

        String situacaoFinal;
        if(situacaoMatematica.equals("Aprovado") && situacaoQuimica.equals("Aprovado") && situacaoFisica.equals("Aprovado")){
            situacaoFinal = "APROVADO";
        } else {
            situacaoFinal = "REPROVADO";
        }

        System.out.println("\nSituação do aluno(a) " + nome);
        System.out.println("Lembrando que a media para a aprovação informada foi " + mediaAprovacao);
        System.out.println("Matematica " + situacaoMatematica);
        System.out.println("Quimica " + situacaoQuimica);
        System.out.println("Fisica " + situacaoFisica);
        System.out.println("Situação Final " + situacaoFinal);

        scanner.close();
    }
}
