public class Main {
    public static void main(String[] args) {
        double[] numeros = {10.0, 20.0, 30.0};
        double media = calcularMedia(numeros);
        listarElementos(numeros);

        System.out.println("\nMédia dos elementos é: " + media);
    }

    public static void listarElementos(double[] array){
        System.out.print("Lista de elementos: ");
        for(double num : array){
            System.out.print(num + "  ");
        }
    }

    public static double calcularMedia(double[] array) {
        array = adicionarElemento(array, 40.0); // Adiciona o novo elemento
        double soma = 0;
        for (double num : array) {
            soma += num; // Soma os elementos corretamente
        }
        return soma / array.length; // Calcula a média
    }

    public static double[] adicionarElemento(double[] array, double novoElemento) {
        double[] novoArray = new double[array.length + 1];
        System.arraycopy(array, 0, novoArray, 0, array.length);
        novoArray[array.length] = novoElemento; // Corrigido para adicionar o elemento corretamente
        return novoArray;
    }
}
