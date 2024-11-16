public class Main {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 1, 12, 15, 16, 2};

        bubbleSort(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        boolean trocou;
        for (int i = 0; i < array.length - 1; i++) {
            trocou = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }
            // Se nenhuma troca foi feita, o array já está ordenado
            if (!trocou) {
                break;
            }
        }
    }
}
