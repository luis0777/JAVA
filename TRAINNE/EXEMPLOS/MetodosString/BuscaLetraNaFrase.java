package MetodosString;

import javax.swing.JOptionPane;

public class BuscaLetraNaFrase {
    public static void main(String args[]) {
        String frase = "aula de Java";
        char caractere = 'a';
        JOptionPane.showMessageDialog(null, "Na frase: \"" + frase + "\"" +
                "\n\nÍndices de ocorrência da letra a:\n"
                + "índice: " + frase.indexOf(caractere) +
                "\n" + "índice: " + frase.indexOf(caractere, 10) +
                "\n\nÍndices de ocorrência da palava Java a partir do 12:" +
                "\nÍndice: " + frase.indexOf(caractere, 12) +
                "\n\nÍndice de ocorrência da sílaba de:" +
                "\nÍndice: " + frase.indexOf("de"));
    }
}

