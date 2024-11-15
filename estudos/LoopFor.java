import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,};

        int somaFor = 0;

        for(int i = 0; i < numeros.length; i++){
            somaFor += numeros[i];
        }

        System.out.print("Soma utilizando loop for: " + somaFor);
    }
}
