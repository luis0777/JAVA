package MetodosString;

import javax.swing.JOptionPane;
public class PedacosDaFrase {
    public static void main(String args[]) {
            
    	String frase = "Aula de Java - Substring";
        
    	JOptionPane.showMessageDialog(null, "Frase: " + frase + "\nFicou assim:\n\n"+
                    frase.substring(0,7)+
                    frase.substring(14)+
                    frase.substring(12,15)+
                    frase.substring(8,12));
    }
}
