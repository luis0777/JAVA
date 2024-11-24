package ExemplosArrayMatrizes;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Comparator;

public class ExemploMatrizEntradaDadosOrdenacaoString {
    public static void main(String[] args) {
        // Solicita o número de alunos
        String numAlunosStr = JOptionPane.showInputDialog("Digite o número de alunos:");
        int numAlunos = Integer.parseInt(numAlunosStr);

        // Cria a matriz para armazenar os dados dos alunos
        String[][] alunos = new String[numAlunos][2]; // [numAlunos][2] --> [linhas][colunas]

        // Coleta as informações dos alunos
        for (int i = 0; i < numAlunos; i++) {
            String nome = JOptionPane.showInputDialog("Aluno #" + (i + 1) + "\nNome:");
            String nota = JOptionPane.showInputDialog("Aluno #" + (i + 1) + "\nNota:");

            // Armazena as informações na matriz
            alunos[i][0] = nome;
            alunos[i][1] = nota;
        }

        // Ordena os alunos por nome usando Arrays.sort com Comparator
        Arrays.sort(alunos, new Comparator<String[]>() {
            @Override
            public int compare(String[] aluno1, String[] aluno2) {
                return aluno1[0].compareToIgnoreCase(aluno2[0]);
            }
        });

        // Apresenta as informações na tela
        String informacoes = "\nInformações dos alunos (ordenados por nome):\n";
        for (int i = 0; i < numAlunos; i++) {
            String nome = alunos[i][0];
            String nota = alunos[i][1];
            informacoes += "Aluno #" + (i + 1) + ": " + nome + " - Nota: " + nota + "\n";
        }
        JOptionPane.showMessageDialog(null, informacoes);
    }
}
