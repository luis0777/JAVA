package metodosComSemRetorno;

import javax.swing.JOptionPane;

public class MetodosSemRetorno {

    public static void main(String args[]) {

        imprimir();
        imprimirTexto("Método Imprimir Texto");
        quadrado(10);
        somar(10, 20);
        maior(10, 20, 30);
        sexo('m'); // Teste com maiúsculo/minúsculo
    }

    public static void imprimir() {
        JOptionPane.showMessageDialog(null, "Aprendendo a Linguagem Java");
    }

    public static void imprimirTexto(String valorDeEntrada) {
        JOptionPane.showMessageDialog(null, valorDeEntrada);
    }

    public static void quadrado(int valorInformado) {
        JOptionPane.showMessageDialog(null,
                "Valor ao quadrado de " + valorInformado + "\n" + Math.pow(valorInformado, 2));
    }

    public static void somar(int a, int b) {
        JOptionPane.showMessageDialog(null, "A soma dos valores fornecidos: " + a + " + " + b + " = " + (a + b));
    }

    public static void maior(int a, int b, int c) {
        JOptionPane.showMessageDialog(null,
                "O maior número entre: " + a + ", " + b + " e " + c + " é\n" + Math.max(c, Math.max(a, b)));
    }

    public static void sexo(char c) {

        String sexo = String.valueOf(c);
        // Incluir aceitar maius / minus
        if (sexo.toUpperCase().equals("F")) {
            JOptionPane.showMessageDialog(null, "Feminino");
        // Rever a lógica
        } else {
            JOptionPane.showMessageDialog(null, "Masculino");
        }
    }
}
