package ExemplosArrayMatrizes;

public class ExemploMatrizSoma {
    public static void main(String args[]) {
        // Declaração e inicialização de duas matrizes 2x2
        int[][] matriz1 = { { 1, 2 }, { 3, 4 } };
        int[][] matriz2 = { { 5, 6 }, { 7, 8 } };

        // Matriz resultante da soma
        int[][] resultado = new int[2][2];

        // Soma das matrizes
        for (int i = 0; i < matriz1.length; i++) {

            for (int j = 0; j < matriz1[i].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }

        }

        // Impressão do resultado
        for (int i = 0; i < resultado.length; i++) {

            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}

