package MetodosString;

import javax.swing.JOptionPane;
public class MaiusculoMinusculo {
    public static void main(String args[]) {
        
    	String frase = JOptionPane.showInputDialog("Informe uma frase");
        JOptionPane.showMessageDialog(null, "Frase: " + frase +
            "\nTodas em Maiúsculas: " + frase.toUpperCase() +
            "\nTodas em Minúsculas: " + frase.toLowerCase());
    }
}



