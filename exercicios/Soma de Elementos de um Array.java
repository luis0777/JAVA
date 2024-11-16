public class Main {
    public static void main(String[] args) {
        int [] numeros = {10, 120, -13, 40, 0, 0, -7, 3, 9};

        int soma = somaElementos(numeros);

        System.out.println("Soma dos elementos: " + soma);
    }
    public static  int somaElementos(int [] array){
        int soma = 0;
        for(int num : array){
            soma += num;
        }
        return soma;
    }
}
