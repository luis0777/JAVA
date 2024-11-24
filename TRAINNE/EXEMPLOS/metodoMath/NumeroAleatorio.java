package metodoMath;

import javax.swing.JOptionPane;

public class NumeroAleatorio {
    public static void main(String[] args) {

        String aux = "";
        // Contagem de 1 a 10
        for (int cont = 1; cont <= 10; cont++) {
            int num = (int) (Math.random() * 11);// Gera Numeros 0-10
            aux = aux + cont + " ==> " + num + "\n";// Saída dos valores
        }
        JOptionPane.showMessageDialog(null,
                "Gera Números aleatórios: 0 a 10\n" + aux);
    }
}

