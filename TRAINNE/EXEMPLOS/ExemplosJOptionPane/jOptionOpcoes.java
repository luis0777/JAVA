package  ExemplosJOptionPane;
import javax.swing.JOptionPane;

public class jOptionOpcoes {
    public static void main(String[] args) {
        Object[] options = { "Opção 1", "Opção 2", "Opção 3" };
        int escolha = JOptionPane.showOptionDialog(null,
                "Escolha uma opção:",
                "Título da Janela",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);
        JOptionPane.showMessageDialog(null, "Você escolheu: " + options[escolha]);

        //Garantir o fechamento do programa em memória
        System.exit(0);
    }
}
