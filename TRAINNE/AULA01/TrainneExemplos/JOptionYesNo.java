import javax.swing.*;

public class JOptionYesNo{
    public static void main(String [] args){
        int resposta = JOptionPane.showConfirmDialog(null, "Continuar ou parar?");

        if(resposta == JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null, "Você continuou");
        }else if(resposta == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Parou porque?");
        } else if (resposta == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Você cancelou");
        } else if (resposta == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Você fechou a janela??? Porque");
        }
    }
}
