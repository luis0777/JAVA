package metodosComSemRetorno;

import javax.swing.JOptionPane;

public class ExemploMetodoComRetorno {
    public static void main(String[] args) {
        double celsius = 25.0;

        double fahrenheit = converterCelsiusParaFahrenheit(celsius);
        JOptionPane.showMessageDialog(null,"A temperatura: " + 
        celsius+ " em Fahrenheit é: " + fahrenheit);
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

