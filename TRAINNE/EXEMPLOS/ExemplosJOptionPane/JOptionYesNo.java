package  ExemplosJOptionPane;
import javax.swing.JOptionPane;

public class JOptionYesNo {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null, "Continuar ou Parar?");

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você Continuou");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Parou PorQue???");
        } else if (resposta == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Você Cancelou");
        } else if (resposta == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Você fechou a janela??? PorQue");
        }
    }
}

