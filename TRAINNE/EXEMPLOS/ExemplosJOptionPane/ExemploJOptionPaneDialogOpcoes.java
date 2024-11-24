package  ExemplosJOptionPane;

import javax.swing.JOptionPane;

public class ExemploJOptionPaneDialogOpcoes {
    public static void main(String[] args) {
        boolean caixa = true;
        // Caixa de diálogo de entrada de texto
        Object[] options = { "Sim", "Não", "Talvez", "Cancelar" };
        while (caixa) {
            int opcao = JOptionPane.showOptionDialog(null, "Executar o programa de novo?",
                    "De novo?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (opcao == 0) {
                // verifica se o usuário clicou no botão SIM
                JOptionPane.showMessageDialog(null, "Clicou SIM");
            } else if (opcao == 1) {
                // verifica se o usuário clicou no botão Não
                JOptionPane.showMessageDialog(null, "Clicou Não\nSerá Fechado");
                caixa = false;
            } else if (opcao == 2) {
                // verifica se o usuário clicou no botão Talvez
                JOptionPane.showMessageDialog(null, "Clicou Talvez");
            } else if (opcao == 3) {
                // verifica se o usuário clicou no botão Cancelar
                JOptionPane.showMessageDialog(null, "Clicou Cancelar");
            } else {
                // verifica se o usuário clicou no "X" da Cx de Dialogo
                JOptionPane.showMessageDialog(null, "Clicou X");
            }
        }
    }
}


