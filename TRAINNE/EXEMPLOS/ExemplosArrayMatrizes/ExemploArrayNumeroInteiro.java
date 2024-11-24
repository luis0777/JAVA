package ExemplosArrayMatrizes;

public class ExemploArrayNumeroInteiro {
    public static void main(String[] args) {
        // Criando array de números inteiros
        int[] numeros = {10,20,30,40,50};

        // Acessando elementos de array
        System.out.println("Item: " +numeros[0]);
        System.out.println("Item: " +numeros[2]);

        // Alterando um elemento do array
        numeros[1]=25;

        // Percorrendo o array e imprimindo os elementos
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Indice: " + i + " - Valor: " + numeros[i]);
        }
    }
}

