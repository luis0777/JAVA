import javax.swing.*;

public class Exercicio1{
    public static  void main(String[]args){
        try
        {
            float notaOne = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com a 1° nota"));
            float notaTwo = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com a 2° nota"));
            float notaWork = Float.parseFloat(JOptionPane.showInputDialog(null, "Entre com a nota do trabalho"));

            float media = (notaOne + notaTwo + notaWork)/3;

            String unir = "Notas fornecidas\n" +
                    "1º ==> " + notaOne +
                    "\n2º ==> " + notaTwo +
                    "\nTrabalho ==> " + notaWork +
                    "\n\nMédia ==> " + media;

            JOptionPane.showMessageDialog(null, unir);

        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Erro na conversão,\n" +
                    "Digite apenas caracteres numericos");

        }

    }
}
