package ExemplosArrayMatrizes;

public class ExemploArrayString{
    public static void main(String[] args) {
        // Criando array de Strings
        String[] nomes = {"Ragnar", "Laguerta", "Ivar"};

        // Acessando elementos de array
        System.out.println("Nome: " +nomes[0]);
        System.out.println("Nome: " +nomes[2]);

        // Alterando um elemento do array
        nomes[1]="Iron Man";

        // Percorrendo o array e imprimindo os elementos
        for(int i = 0; i <nomes.length; i++){
            System.out.println("Indice: " + i + " - Valor: " + nomes[i]);
        }
    }
}


