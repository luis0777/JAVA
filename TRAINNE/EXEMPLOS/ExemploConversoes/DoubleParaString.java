package ExemploConversoes;

public class DoubleParaString {
    public static void main(String[] args) {
        double numeroDouble = 789.01;
        String numeroStr = Double.toString(numeroDouble);
        System.out.println("double: " + numeroDouble + " -> String: " + numeroStr);
    }
}

