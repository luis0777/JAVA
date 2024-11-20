import javax.swing.*;
import java.security.SecureRandom;

public class JOptionLista{
    public static void main(String [] args){

        //Array de opções
        String [] options = {"java", "JavaScript", "C#", "Não tenho"};

        /*
        null: deixamos como padrão null para o componente pai
        "Escolha sua linguagem preferida:" A mensagem que será exibida no dialogo
        "Seleção de Linguagem:" o titulo da janela de dialogo
        null: não há icone
        options: Um array de objetos{"Java", "Pynthon",...}
        options[0]: o valor padrão selecionado quando a caixa de dialogo é exibida
         */
        String escolha = (String) JOptionPane.showInputDialog(null,
                "Escolha sua linguagem preferida6",
                "Seleção de Linguagem",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        JOptionPane.showMessageDialog(null,"Você escolheu: " + escolha);
    }
}
