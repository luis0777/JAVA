import javax.swing.*;

public class JOptionAviso{
    public static void main (String [] args){
        JOptionPane.showMessageDialog(null, "Este é um aviso importante!", "Aviso",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Erro ao processar a solicitação!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
