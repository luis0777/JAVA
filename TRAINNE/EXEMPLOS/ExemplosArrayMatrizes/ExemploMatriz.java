package ExemplosArrayMatrizes;

public class ExemploMatriz {
    public static void main(String args[]) {
        int[][] matriz = new int[3][3];

        // Atribuição de valores à matriz
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        // i percorre toda matriz
        for (int i = 0; i < matriz.length; i++) {

            // j percorre os índices
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            // Adiciona uma quebra de linha após cada linha da matriz
            System.out.println();
        }

        // Acesso aos valores da matriz
        int valor = matriz[1][2]; // Retorna o valor 6
        System.out.println("Valor: " + valor);
    }
}



/*
 * Explicação:
 * Primeiro Loop (i = 0): Itera sobre a primeira linha da matriz.
 * 
 * j = 0: Imprime 1
 * 
 * j = 1: Imprime 2
 * 
 * j = 2: Imprime 3
 * 
 * Adiciona quebra de linha (System.out.println()).
 * 
 * Segundo Loop (i = 1): Itera sobre a segunda linha da matriz.
 * 
 * j = 0: Imprime 4
 * 
 * j = 1: Imprime 5
 * 
 * j = 2: Imprime 6
 * 
 * Adiciona quebra de linha (System.out.println()).
 * 
 * Terceiro Loop (i = 2): Itera sobre a terceira linha da matriz.
 * 
 * j = 0: Imprime 7
 * 
 * j = 1: Imprime 8
 * 
 * j = 2: Imprime 9
 * 
 * Adiciona quebra de linha (System.out.println()).
 */
