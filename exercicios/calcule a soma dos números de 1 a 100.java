import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int soma = 0;
        for(byte i = 1; i <= 100; i++){
            soma += i;
        }
        System.out.println("A soma dos numeros de 1 a 100 é " + soma);
    }
}
