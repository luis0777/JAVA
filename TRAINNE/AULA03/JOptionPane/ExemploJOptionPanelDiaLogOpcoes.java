import javax.swing.*;

public class ExemploJOptionPanelDiaLogOpcoes{
    public static void main(String[]args){
        boolean caixa = true;

        Object[] options = {"Sim", "Não", "Talvez", "Cancelar"};
        while (caixa){
            int opcao = JOptionPane.showOptionDialog(null,
                    "Executar o programa de novo?","De novo?",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);
            if(opcao == 0){
                JOptionPane.showMessageDialog(null,"Clicou em sim");
            } else if (opcao == 1) {
                JOptionPane.showMessageDialog(null,"Clicou não\nSerá Fechado");
                caixa = false;
            } else if (opcao == 2) {
                JOptionPane.showMessageDialog(null,"Clicou em talvez");
            } else if (opcao == 3) {
                JOptionPane.showMessageDialog(null,"Clicou Cancelar");
            }else {
                JOptionPane.showMessageDialog(null,"Clicou X");
            }
        }
    }
}
