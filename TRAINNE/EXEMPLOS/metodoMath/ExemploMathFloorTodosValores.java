package metodoMath;

public class ExemploMathFloorTodosValores {
    public static void main(String[] args) {
        double inicio = 5.0;
        double fim = 5.9;

        System.out.println("Valores entre 5.0 e 5.9 (incluindo 5.0 e 5.9) com Math.floor:");

        for (double i = inicio; i <= fim; i += 0.1) {
            double valorArredondado = Math.floor(i * 10) / 10;
            System.out.println("Valor original: " + i + " | Valor com floor: " + valorArredondado);
        }
    }
}
