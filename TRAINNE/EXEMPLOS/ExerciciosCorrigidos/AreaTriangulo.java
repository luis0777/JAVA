package ExerciciosCorrigidos;

import javax.swing.JOptionPane;

public class AreaTriangulo {
    public static void main(String args[]) {
        double base = 0, altura = 0, area = 0;
        try {
            base = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor da base", "Base", 3));
            altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor da altura:", "Altura", 3));

            area = (base * altura) / 2;
            
            JOptionPane.showMessageDialog(null, "Area do triangulo : " + area);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,
                    "Houve erro na conversao, digite apenas caracteres numericos \n" + erro.toString());
        }
    }
}
