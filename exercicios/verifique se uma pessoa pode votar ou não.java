import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String resposta;
       do {
           System.out.println("POSSO VOTAR?");

           System.out.print("Qual a sua idade? ");
           byte idade = scanner.nextByte();

           scanner.nextLine();

           if (idade >= 18) {
               System.out.println("Você tem " + idade + " sendo assim PODE VOTAR.");
           } else {
               System.out.println("Você tem " + idade + " sendo assim NÃO PODE VOTAR");
           }

           System.out.println("Deseja fazer novamente? S/N");
           resposta = scanner.nextLine();
       }while(resposta.equalsIgnoreCase("s"));
       
       System.out.println("PROGRAMA ENCERRADO");
       scanner.close();
    }
}
