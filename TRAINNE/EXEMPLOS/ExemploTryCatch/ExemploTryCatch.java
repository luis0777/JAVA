package ExemploTryCatch;
import javax.swing.JOptionPane;
public class ExemploTryCatch {
    public static void main(String args[]) {
        float valor1,valor2;
    	String num1 = JOptionPane.showInputDialog("Forneça um número:");
        String num2 = JOptionPane.showInputDialog("Forneça outro valor:");
        
        try {
        //Testa ou valida o valor fornecido
            valor1=Float.parseFloat(num1);//Entra o nr "5" ==> 5.0
            valor2=Float.parseFloat(num2);
        	JOptionPane.showMessageDialog(null,"Somas dos valores: " +(valor1+valor2));
        }
        //Caso houver algum erro, serão executadas as linhas abaixo
        catch (NumberFormatException myErro) {
            JOptionPane.showMessageDialog(null, "Erro de conversão, forneça apenas valores numéricos \n\n" + myErro.toString());
        }
        // Garante que o app foi fechado
        System.exit(0);
    }
}


