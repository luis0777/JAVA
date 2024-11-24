package MetodosString;

import javax.swing.JOptionPane;
public class TrocandoCaracteres {
    public static void main(String args[]) {
    	
        String frase = "Aula de Java - Replace";
        
        JOptionPane.showMessageDialog(null, "Frase: " + frase +
                "\nRetirando os espaços: " + frase.replace(" ", "") +
                "\nSubstituindo a por u: " + frase.replace("a", "u"));
    }
}



