import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(byte i = 0; i <= 30; i++){
            if(i % 2 == 0){
                System.out.println(i + " é par");
            }else{
                System.out.println(i + " é impar");
            }
        }
    }
}
