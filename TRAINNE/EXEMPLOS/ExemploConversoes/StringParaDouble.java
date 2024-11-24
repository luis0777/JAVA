package ExemploConversoes;

public class StringParaDouble {
    public static void main(String[] args) {
        String numeroStr = "123.45";
        double numeroDouble = Double.parseDouble(numeroStr);
        System.out.println("String: " + numeroStr + " -> double: " + numeroDouble);
    }
}

