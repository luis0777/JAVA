package ExemplosArrayMatrizes;

import javax.swing.JOptionPane;

public class ExemploArrayObtendoDados {
    public static void main(String[] args) {
        // Declarando variáveis globais
        String nomes;
        int qtdeNomes;
        // Obtendo a quantidade de nomes
        nomes = JOptionPane.showInputDialog("Informe a quantidade de nomes a\nserem inseridos no array");
        // Convertendo para Inteiro
        qtdeNomes = Integer.parseInt(nomes);

        // Declarando o array com a qtde fornecida
        String[] nomesArray = new String[qtdeNomes];

        // Entrando com os nomes conforme a qtde fornecida
        for (int i = 0; i < nomesArray.length; i++) {
            nomesArray[i] = JOptionPane.showInputDialog("Informe o nome do " + (i + 1) + "º");
        }

        // Apresentando os nomes
        for (int i = 0; i < nomesArray.length; i++) {
            JOptionPane.showMessageDialog(null, "Índice " + i + " - " + "Nome: " + nomesArray[i]);
        }
        System.exit(0);
    }
}
