package ExemploTryCatch;
public class ExemploTryCatch2 {
    public static void main(String[] args) {
        try {
            // Código que pode lançar exceções
            int[] numeros = { 1, 2, 3 };
            int resultado = numeros[5] / 0; // Isso causará uma ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Tratamento para exceção de índice fora dos limites do array
            System.out.println("Erro: Tentou acessar um índice fora dos limites do array.");
        } catch (ArithmeticException e) {
            // Tratamento para exceção aritmética (divisão por zero)
            System.out.println("Erro: Tentou dividir por zero.");
        }
    }
}
