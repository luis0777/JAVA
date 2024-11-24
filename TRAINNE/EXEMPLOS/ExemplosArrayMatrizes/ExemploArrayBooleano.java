package ExemplosArrayMatrizes;

public class ExemploArrayBooleano{
    public static void main(String[] args) {
        // Criando array de Strings
        Boolean[] flags = {true,false,true};

        // Acessando elementos de array
        System.out.println("Valor: " +flags[0]);
        System.out.println("Valor: " +flags[1]);

        // Alterando um elemento do array
        flags[1]=true;

        // Percorrendo o array e imprimindo os elementos
        for(int i = 0; i <flags.length; i++){
            System.out.println("Indice: " + i + " - Valor: " + flags[i]);
        }
    }
}




