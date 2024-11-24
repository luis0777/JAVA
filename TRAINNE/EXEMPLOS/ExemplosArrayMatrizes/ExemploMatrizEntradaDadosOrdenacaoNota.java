package ExemplosArrayMatrizes;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Comparator;

public class ExemploMatrizEntradaDadosOrdenacaoNota {
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
        // Ordem por String/nome
        // Arrays.sort(alunos, Comparator.comparing(a -> a[0]));
        
        // Ordem numérica
        Arrays.sort(alunos, Comparator.comparing(a -> Double.parseDouble(a[1])));

        // Apresenta as informações na tela
        String informacoes = "\nInformações dos alunos (ordenados por nota):\n";
        for (int i = 0; i < numAlunos; i++) {
            String nome = alunos[i][0];
            String nota = alunos[i][1];
            informacoes += "Aluno #" + (i + 1) + ": " + nome + " - Nota: " + nota + "\n";
        }
        JOptionPane.showMessageDialog(null, informacoes);
    }
}

