import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(byte i = 1; i <= 30; i++){
            if(i < 18){
                System.out.println(i + " menor de idade");
            }else{
                System.out.println(i + " maior de idade");
            }
        }
    }
}
