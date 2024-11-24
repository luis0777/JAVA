package metodoMath;

import javax.swing.*;

public class NumeroAleatorio2 {
    public static void main(String[] args) {
        int min = 20; // Início
        int max = 40; // Fim
        String aux="";

        for (int i = min; i <= max; i++) {
            int numeroAleatorio = (int) (Math.random() * (max - min + 1)) + min;
            aux+= i+"º ==> " + numeroAleatorio + "\n";
        }
        JOptionPane.showMessageDialog(null, "Números aleatórios entre 20 e 40:\n"+aux);
    }
}

