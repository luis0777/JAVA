package codigoFonte;
import javax.swing.JOptionPane;

public class _06_EntradaDados_OptionPane2 {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "Mensagem de exemplo!");

        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
    }
}

