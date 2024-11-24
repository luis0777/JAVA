package ExemplosArrayMatrizes;

import javax.swing.JOptionPane;

public class ExemploMatrizEntradaDados {
    public static void main(String[] args) {
        // Solicita o número de alunos
        String numAlunosStr = JOptionPane.showInputDialog("Digite o número de alunos:");
        int numAlunos = Integer.parseInt(numAlunosStr); // "10" String <==> 10 inteiro

        // Cria a matriz para armazenar: alunos/notas pela qtde acima: variável numAlunos
        // Colunas fixadas em 2, sendo uma para o aluno e outro para nota
        String[][] alunos = new String[numAlunos][2];

        // Coleta as informações dos alunos
        for (int i = 0; i < numAlunos; i++) { // 0 < 2
            String nome = JOptionPane.showInputDialog("Aluno #" + (i + 1) + "\nNome:");
            String nota = JOptionPane.showInputDialog("Aluno #" + (i + 1) + "\nNota:");

            // Armazena as informações na matriz
            alunos[i][0] = nome;
            alunos[i][1] = nota;
        }

        // Apresenta as informações
        String informacoes = "\nInformações dos alunos:\n";
        for (int i = 0; i < numAlunos; i++) {
            String nome = alunos[i][0];
            String nota = alunos[i][1];
            informacoes += "Aluno #" + (i + 1) + ": " + nome + " - Nota: " + nota + "\n";
        }
        JOptionPane.showMessageDialog(null, informacoes);
    }
}

