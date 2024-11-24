package codigoFonte;
import javax.swing.JOptionPane;

public class _06_EntradaDados_OptionPane {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null, "Continuar?");
        if (resposta == JOptionPane.YES_OPTION) {
            System.out.println("Sim/Yes Pressionado");
        } else {
            System.out.println("No/Nao Pressionado");
        }
    }
}


