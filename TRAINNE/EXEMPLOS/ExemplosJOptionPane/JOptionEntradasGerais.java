package  ExemplosJOptionPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class JOptionEntradasGerais {
    public static void main(String[] args) {
        JTextField nomeField = new JTextField(5);
        JTextField idadeField = new JTextField(5);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Nome:"));
        panel.add(nomeField);
        panel.add(new JLabel("Idade:"));
        panel.add(idadeField);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "Por favor, insira seu nome e idade", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String nome = nomeField.getText();
            int idade = Integer.parseInt(idadeField.getText());
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade);
        }
    }
}
