package metodoMath;

import javax.swing.JOptionPane;
public class ArredondamentoParaBaixo {
    public static void main(String args[]) {
        double n1 = 5.2, n2 = 5.6, n3 = -5.8;
        JOptionPane.showMessageDialog(null, "Arredondando com floor: " +
                "\n" + n1 + "==> " + Math.floor(n1) +
                ",\n" + n2 + "==> " + Math.floor(n2) +
                ",\n" + n3 + "==> " + Math.floor(n3));
    }
}


