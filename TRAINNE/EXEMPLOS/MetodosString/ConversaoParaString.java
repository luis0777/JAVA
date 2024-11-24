package MetodosString;

import javax.swing.JOptionPane;
public class ConversaoParaString {
    public static void main(String args[]) {
        int a = 1000;
        long b = 5000;
        float c = 20.45f;
        double d = 15.432;
        String pular="\n";
        String result = 
        		   "Valores convertidos em String:"+ pular +
        		   String.valueOf(a) + pular + String.valueOf(b) + pular +
                   String.valueOf(c) + pular + String.valueOf(d).replace(".", ",");
        JOptionPane.showMessageDialog(null, result);
    }
}










